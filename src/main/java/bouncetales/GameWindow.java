package bouncetales;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Desktop window hosting the fixed-size game surface. The game renders into an
 * off-screen buffer; {@link #flush()} publishes it and the panel scales it to
 * fit the window while keeping the aspect ratio.
 *
 * <p>Keys are translated to the classic handset key codes the game logic
 * expects: -1/-2/-3/-4 d-pad, -5 fire, -6/-7 soft keys, '0'-'9', '*' and '#'.
 */
public final class GameWindow {
    public static final int WIDTH = 240;
    public static final int HEIGHT = 320;

    private final BufferedImage back = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    private final BufferedImage front = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    private final Gfx backGfx = new Gfx(back);
    private final Object frameLock = new Object();
    private final Map<Integer, Integer> held = new HashMap<>();
    private static final long FRAME_NANOS = 1_000_000_000L / 60;
    private long lastFlush;
    private JFrame frame;
    private JPanel panel;

    public Gfx getGraphics() {
        return backGfx;
    }

    public int getWidth() {
        return WIDTH;
    }

    public int getHeight() {
        return HEIGHT;
    }

    /** Copies the back buffer to the visible surface. */
    public void flush() {
        long now = System.nanoTime();
        long wait = FRAME_NANOS - (now - lastFlush);
        if (wait > 0) {
            try {
                Thread.sleep(wait / 1_000_000L, (int) (wait % 1_000_000L));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        lastFlush = System.nanoTime();
        synchronized (frameLock) {
            front.getGraphics().drawImage(back, 0, 0, null);
        }
        if (panel != null) {
            panel.repaint();
        }
    }

    /** Creates and shows the window. Safe to call from any thread. */
    public void show(final int initialScale) {
        try {
            Runnable r = () -> build(initialScale);
            if (SwingUtilities.isEventDispatchThread()) {
                r.run();
            } else {
                SwingUtilities.invokeAndWait(r);
            }
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public void close() {
        SwingUtilities.invokeLater(() -> {
            if (frame != null) {
                frame.dispose();
            }
        });
    }

    private void build(int scale) {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int pw = getWidth();
                int ph = getHeight();
                int s = Math.max(1, Math.min(pw / GameWindow.WIDTH, ph / GameWindow.HEIGHT));
                int w;
                int h;
                if (s >= 1 && pw >= GameWindow.WIDTH && ph >= GameWindow.HEIGHT) {
                    // integer scaling keeps pixel art crisp
                    w = GameWindow.WIDTH * s;
                    h = GameWindow.HEIGHT * s;
                } else {
                    double f = Math.min(pw / (double) GameWindow.WIDTH, ph / (double) GameWindow.HEIGHT);
                    w = (int) (GameWindow.WIDTH * f);
                    h = (int) (GameWindow.HEIGHT * f);
                }
                int x = (pw - w) / 2;
                int y = (ph - h) / 2;
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, pw, ph);
                ((java.awt.Graphics2D) g).setRenderingHint(
                        RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
                synchronized (frameLock) {
                    g.drawImage(front, x, y, w, h, null);
                }
            }
        };
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(WIDTH * scale, HEIGHT * scale));
        panel.setFocusable(true);
        panel.setFocusTraversalKeysEnabled(false);
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int code = translate(e);
                if (code == 0 || held.containsKey(e.getKeyCode())) {
                    return; // unmapped, or auto-repeat
                }
                held.put(e.getKeyCode(), code);
                Engine.keyPressed(code);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                Integer code = held.remove(e.getKeyCode());
                if (code != null) {
                    Engine.keyReleased(code);
                }
            }
        });

        frame = new JFrame("Bounce Tales");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Engine.requestQuit();
                Thread t = new Thread(() -> {
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException ignored) {
                        // exit regardless
                    }
                    System.exit(0);
                }, "exit-timer");
                t.setDaemon(true);
                t.start();
            }

            @Override
            public void windowIconified(WindowEvent e) {
                held.clear();
                Engine.pause();
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                Engine.resume();
            }
        });
        frame.setVisible(true);
        panel.requestFocusInWindow();
    }

    /** Maps an AWT key event to a handset key code, or 0 if unmapped. */
    private static int translate(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP: case KeyEvent.VK_W: return -1;
            case KeyEvent.VK_DOWN: case KeyEvent.VK_S: return -2;
            case KeyEvent.VK_LEFT: case KeyEvent.VK_A: return -3;
            case KeyEvent.VK_RIGHT: case KeyEvent.VK_D: return -4;
            case KeyEvent.VK_ENTER: case KeyEvent.VK_SPACE: return -5;
            case KeyEvent.VK_F1: case KeyEvent.VK_Z: case KeyEvent.VK_Q: return -6;
            case KeyEvent.VK_F2: case KeyEvent.VK_X: case KeyEvent.VK_E: case KeyEvent.VK_ESCAPE: return -7;
            case KeyEvent.VK_MULTIPLY: case KeyEvent.VK_ASTERISK: return '*';
            case KeyEvent.VK_NUMBER_SIGN: return '#';
            default: break;
        }
        int kc = e.getKeyCode();
        if (kc >= KeyEvent.VK_0 && kc <= KeyEvent.VK_9) {
            return '0' + (kc - KeyEvent.VK_0);
        }
        if (kc >= KeyEvent.VK_NUMPAD0 && kc <= KeyEvent.VK_NUMPAD9) {
            return '0' + (kc - KeyEvent.VK_NUMPAD0);
        }
        char c = e.getKeyChar();
        if (c == '*' || c == '#') {
            return c;
        }
        return 0;
    }
}
