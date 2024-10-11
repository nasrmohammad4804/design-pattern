import java.io.FileInputStream;

public class JPGCompressor implements Compressor{
    @Override
    public byte[] compress(FileInputStream file) {
        System.out.println("compressing using jpg for file : ");

        return new byte[]{};
    }
}
