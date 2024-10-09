import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        var history = new BrowseHistory();

        history.push("https://google.com");
        history.push("https://yahoo.com");
        history.push("https://www.linkedin.com");

        /*for (String url : history.getUrls())
            System.out.println("url is : "+url);*/


        Iterator<? super Object> iterator = history.iterator();


        while (iterator.hasNext())
            System.out.println(iterator.next());

        /*for (String url : history)
            System.out.println(url);*/
    }
}
