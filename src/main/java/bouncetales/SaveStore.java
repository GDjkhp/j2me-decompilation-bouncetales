package bouncetales;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * File-backed persistent storage for save data. Files live in
 * {@code ~/.bouncetales} unless the {@code bouncetales.saves} system property
 * points elsewhere.
 */
public final class SaveStore {
    private SaveStore() {
    }

    private static Path dir() {
        String custom = System.getProperty("bouncetales.saves");
        return custom != null ? Paths.get(custom) : Paths.get(System.getProperty("user.home"), ".bouncetales");
    }

    public static void write(String name, byte[] data) {
        try {
            Path d = dir();
            Files.createDirectories(d);
            Path tmp = d.resolve(name + ".dat.tmp");
            Files.write(tmp, data);
            Files.move(tmp, d.resolve(name + ".dat"), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println("Could not save '" + name + "': " + e);
        }
    }

    /** @return the stored bytes, or null if nothing has been saved. */
    public static byte[] read(String name) {
        try {
            Path f = dir().resolve(name + ".dat");
            return Files.isRegularFile(f) ? Files.readAllBytes(f) : null;
        } catch (IOException e) {
            return null;
        }
    }
}
