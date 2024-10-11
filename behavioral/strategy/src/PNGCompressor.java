import java.io.FileInputStream;

public class PNGCompressor implements Compressor{

    @Override
    public byte[] compress(FileInputStream file) {
        System.out.println("compressing using png for file : ");
        return new byte[] { };
    }
}
