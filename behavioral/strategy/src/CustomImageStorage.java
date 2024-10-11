import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CustomImageStorage {


    public void storeImage(String fileName,Compressor compressor, Filter filter) throws FileNotFoundException {

        compressor.compress(new FileInputStream(fileName));
        filter.apply(new FileInputStream(fileName));
        System.out.println("store applied compressed and filtered image");
//        store image after compress & filter
    }
}
