import java.io.FileInputStream;

public class HighContrastFilter implements Filter{
    @Override
    public byte[] apply(FileInputStream file) {
        System.out.println("applying high contrast filter on file : ");
        return new byte[] {};
    }
}
