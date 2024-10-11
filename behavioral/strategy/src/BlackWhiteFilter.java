import java.io.FileInputStream;

public class BlackWhiteFilter implements Filter{
    @Override
    public byte[] apply(FileInputStream file) {
        System.out.println("applying black and white filter on file : ");
        return new byte[] {};
    }
}
