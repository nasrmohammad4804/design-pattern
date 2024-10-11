import java.io.FileInputStream;

public interface Filter {

    byte[] apply(FileInputStream file);
}
