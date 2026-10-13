package bouncetales;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/** Image wrapper around {@link BufferedImage}. */
public final class Img {
    private final BufferedImage image;

    private Img(BufferedImage image) {
        this.image = image;
    }

    BufferedImage image() {
        return image;
    }

    /** Decodes PNG (or other ImageIO-supported) data. */
    public static Img create(byte[] data, int off, int len) throws IOException {
        BufferedImage bi = ImageIO.read(new ByteArrayInputStream(data, off, len));
        if (bi == null) {
            throw new IOException("unsupported image data");
        }
        return new Img(toArgb(bi));
    }

    /** Loads an image from a classpath resource such as {@code "/ae.png"}. */
    public static Img create(String resource) throws IOException {
        try (InputStream in = Img.class.getResourceAsStream(resource)) {
            if (in == null) {
                throw new IOException("missing resource " + resource);
            }
            BufferedImage bi = ImageIO.read(in);
            if (bi == null) {
                throw new IOException("unsupported image " + resource);
            }
            return new Img(toArgb(bi));
        }
    }

    /** Creates a blank opaque white image that can be drawn into. */
    public static Img create(int w, int h) {
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Gfx g = new Gfx(bi);
        g.setColor(0xFFFFFF);
        g.fillRect(0, 0, w, h);
        g.dispose();
        return new Img(bi);
    }

    /** Copies another image. */
    public static Img create(Img src) {
        BufferedImage s = src.image;
        BufferedImage bi = new BufferedImage(s.getWidth(), s.getHeight(), BufferedImage.TYPE_INT_ARGB);
        bi.getGraphics().drawImage(s, 0, 0, null);
        return new Img(bi);
    }

    /** Creates an image from 0xAARRGGBB pixels. */
    public static Img createRGB(int[] rgb, int w, int h, boolean alpha) {
        BufferedImage bi = new BufferedImage(w, h, alpha ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB);
        bi.setRGB(0, 0, w, h, rgb, 0, w);
        return new Img(bi);
    }

    private static BufferedImage toArgb(BufferedImage src) {
        if (src.getType() == BufferedImage.TYPE_INT_ARGB) {
            return src;
        }
        BufferedImage out = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TYPE_INT_ARGB);
        out.getGraphics().drawImage(src, 0, 0, (Color) null, null);
        return out;
    }

    public int getWidth() {
        return image.getWidth();
    }

    public int getHeight() {
        return image.getHeight();
    }

    public Gfx getGraphics() {
        return new Gfx(image);
    }

    public void getRGB(int[] out, int off, int scan, int x, int y, int w, int h) {
        image.getRGB(x, y, w, h, out, off, scan);
    }
}
