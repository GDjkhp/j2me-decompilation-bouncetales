package bouncetales;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/**
 * Thin drawing facade over {@link Graphics2D} that keeps the pixel-oriented
 * calling conventions the game logic was written against (integer RGB colours,
 * anchor flags, sprite transforms, clip rectangle getters).
 */
public final class Gfx {
    // Anchor flags
    public static final int HCENTER = 1;
    public static final int VCENTER = 2;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int TOP = 16;
    public static final int BOTTOM = 32;
    public static final int BASELINE = 64;

    // Font styles
    public static final int PLAIN = Font.PLAIN;
    public static final int BOLD = Font.BOLD;
    public static final int ITALIC = Font.ITALIC;

    private static final Graphics2D METRICS_G;

    static {
        BufferedImage scratch = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        METRICS_G = scratch.createGraphics();
        METRICS_G.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        METRICS_G.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
    }

    private final Graphics2D g;
    private final Rectangle bounds;
    private Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 13);

    Gfx(BufferedImage target) {
        this.g = target.createGraphics();
        this.bounds = new Rectangle(0, 0, target.getWidth(), target.getHeight());
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        g.setClip(bounds);
        g.setColor(Color.BLACK);
    }

    // ---- fonts -------------------------------------------------------------

    /** Creates a font approximating a "proportional / medium" handset font. */
    public static Font createFont(int style) {
        return new Font(Font.SANS_SERIF, style, 13);
    }

    public static int textWidth(Font f, String s, int off, int len) {
        FontMetrics fm = METRICS_G.getFontMetrics(f);
        return fm.stringWidth(s.substring(off, off + len));
    }

    public static int fontHeight(Font f) {
        return METRICS_G.getFontMetrics(f).getHeight();
    }

    // ---- state -------------------------------------------------------------

    /** Sets an opaque colour from 0xRRGGBB (alpha bits are ignored). */
    public void setColor(int rgb) {
        g.setColor(new Color(rgb & 0xFFFFFF));
    }

    public void setFont(Font f) {
        this.font = f;
    }

    public void setClip(int x, int y, int w, int h) {
        Rectangle r = new Rectangle(x, y, Math.max(w, 0), Math.max(h, 0)).intersection(bounds);
        g.setClip(r.x, r.y, Math.max(r.width, 0), Math.max(r.height, 0));
    }

    private Rectangle clip() {
        Rectangle r = g.getClipBounds();
        return r != null ? r : bounds;
    }

    public int getClipX() {
        return clip().x;
    }

    public int getClipY() {
        return clip().y;
    }

    public int getClipWidth() {
        return clip().width;
    }

    public int getClipHeight() {
        return clip().height;
    }

    // ---- primitives --------------------------------------------------------

    public void fillRect(int x, int y, int w, int h) {
        if (w > 0 && h > 0) {
            g.fillRect(x, y, w, h);
        }
    }

    public void drawRect(int x, int y, int w, int h) {
        if (w >= 0 && h >= 0) {
            g.drawRect(x, y, w, h);
        }
    }

    public void fillArc(int x, int y, int w, int h, int startAngle, int arcAngle) {
        if (w > 0 && h > 0) {
            g.fillArc(x, y, w, h, startAngle, arcAngle);
        }
    }

    public void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        g.fillPolygon(new int[] {x1, x2, x3}, new int[] {y1, y2, y3}, 3);
    }

    /** Fills a polygon using a 0xAARRGGBB colour (alpha is honoured). */
    public void fillPolygon(int[] xs, int xOff, int[] ys, int yOff, int n, int argb) {
        if (n < 3) {
            return;
        }
        int[] px = new int[n];
        int[] py = new int[n];
        System.arraycopy(xs, xOff, px, 0, n);
        System.arraycopy(ys, yOff, py, 0, n);
        Color prev = g.getColor();
        g.setColor(new Color(argb, true));
        g.fillPolygon(px, py, n);
        g.setColor(prev);
    }

    // ---- text --------------------------------------------------------------

    public void drawSubstring(String s, int off, int len, int x, int y, int anchor) {
        if (len <= 0) {
            return;
        }
        String sub = s.substring(off, off + len);
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics();
        int w = fm.stringWidth(sub);
        if ((anchor & HCENTER) != 0) {
            x -= w / 2;
        } else if ((anchor & RIGHT) != 0) {
            x -= w;
        }
        if ((anchor & BOTTOM) != 0) {
            y -= fm.getDescent();
        } else if ((anchor & BASELINE) == 0) { // TOP (default)
            y += fm.getAscent();
        }
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g.drawString(sub, x, y);
    }

    // ---- images ------------------------------------------------------------

    /**
     * Draws a region of a sprite sheet with one of the eight orientation
     * transforms (0 none, 1 mirror+rot180, 2 mirror, 3 rot180, 4 mirror+rot270,
     * 5 rot90, 6 rot270, 7 mirror+rot90).
     */
    public void drawRegion(Img src, int sx, int sy, int w, int h, int transform, int dx, int dy, int anchor) {
        BufferedImage bi = src.image();
        if (sx < 0 || sy < 0 || w <= 0 || h <= 0 || sx + w > bi.getWidth() || sy + h > bi.getHeight()) {
            throw new IllegalArgumentException("region outside image");
        }
        BufferedImage sub = bi.getSubimage(sx, sy, w, h);
        boolean swap = transform >= 4 && transform <= 7;
        int dw = swap ? h : w;
        int dh = swap ? w : h;
        dx = anchorX(dx, dw, anchor);
        dy = anchorY(dy, dh, anchor);

        AffineTransform t = new AffineTransform();
        t.translate(dx, dy);
        switch (transform) {
            case 0: break;
            case 1: t.concatenate(new AffineTransform(1, 0, 0, -1, 0, h)); break;
            case 2: t.concatenate(new AffineTransform(-1, 0, 0, 1, w, 0)); break;
            case 3: t.concatenate(new AffineTransform(-1, 0, 0, -1, w, h)); break;
            case 4: t.concatenate(new AffineTransform(0, 1, 1, 0, 0, 0)); break;
            case 5: t.concatenate(new AffineTransform(0, 1, -1, 0, h, 0)); break;
            case 6: t.concatenate(new AffineTransform(0, -1, 1, 0, 0, w)); break;
            case 7: t.concatenate(new AffineTransform(0, -1, -1, 0, h, w)); break;
            default: throw new IllegalArgumentException("transform " + transform);
        }
        g.drawImage(sub, t, null);
    }

    /** Draws an array of 0xAARRGGBB pixels. */
    public void drawRGB(int[] rgb, int off, int scan, int x, int y, int w, int h, boolean alpha) {
        if (w <= 0 || h <= 0) {
            return;
        }
        BufferedImage img = new BufferedImage(w, h, alpha ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB);
        for (int row = 0; row < h; row++) {
            img.setRGB(0, row, w, 1, rgb, off + row * scan, w);
        }
        g.drawImage(img, x, y, null);
    }

    private static int anchorX(int x, int w, int anchor) {
        if ((anchor & HCENTER) != 0) {
            return x - w / 2;
        }
        if ((anchor & RIGHT) != 0) {
            return x - w;
        }
        return x;
    }

    private static int anchorY(int y, int h, int anchor) {
        if ((anchor & VCENTER) != 0) {
            return y - h / 2;
        }
        if ((anchor & BOTTOM) != 0) {
            return y - h;
        }
        return y;
    }

    void dispose() {
        g.dispose();
    }
}
