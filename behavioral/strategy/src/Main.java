import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        String fileName ="picture.jpg";
        CustomImageStorage imageStorage = new CustomImageStorage();

        /*
        * store image with high contrast filter
        * */
        imageStorage.storeImage(
                fileName, new PNGCompressor(), new HighContrastFilter()
        );

        /*
        * store same image with different filter algorithm (black & white)
        * */
        imageStorage.storeImage(
                fileName, new PNGCompressor(), new BlackWhiteFilter()
        );
    }
}
