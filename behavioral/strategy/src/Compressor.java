import java.io.FileInputStream;

public interface Compressor {

    byte[] compress(FileInputStream file);
}
