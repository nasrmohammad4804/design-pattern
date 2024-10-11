package oldway;


public class ImageStorage {

    private final ImageCompressionAlgorithm compressionAlgorithm;
    private final ImageFilter filter;

    /*
    * this implementation has few issue
    * 1. that violate single responsibility . our responsibility is to store user image not compressing or filter on that
    * 2. that violate open close principle. if we add a new compression algorithm or new filter we need to modify  store() method instead of extending
    * */

    public ImageStorage(ImageCompressionAlgorithm compressionAlgorithm, ImageFilter filter) {
        this.compressionAlgorithm = compressionAlgorithm;
        this.filter = filter;
    }

    public void store(String fileName){
//        first we need to compress image with one of compression image algorithms such as (jpeg . png)
        if (compressionAlgorithm== ImageCompressionAlgorithm.JPEG){
            System.out.println("compressing using jpeg");
        }
        else if(compressionAlgorithm== ImageCompressionAlgorithm.PNG){
            System.out.println("compressing using png");
        }


        if (filter== ImageFilter.BLACK_WHITE){
            System.out.println("applying black & white filter");
        }
        else if(filter== ImageFilter.HIGH_CONTRAST){
            System.out.println("applying high contrast filter");
        }
    }
}
