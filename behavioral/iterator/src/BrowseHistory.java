import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class BrowseHistory {

    /*
    * if we in future use array or queue instead of list . and travers on urls maybe in different way.
    *  for example for array need access to element with index
    *  if we change inside this class. then we need deal with breaking inside this class not on other consumers like (Main class)
    * */

    /*
    * in new implementation if store urls in list we use ListIterator and if we use array we use ArrayIterator
    * */

    private final List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public String pop() {

        if (!urls.isEmpty())
            return urls.remove(urls.size() - 1);

        return null;
    }

//    @Override
    public Iterator<? super Object> iterator() {
        return new ListIterator(urls);
    }
}
