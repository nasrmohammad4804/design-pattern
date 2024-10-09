import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ListIterator implements Iterator<Object> {

    private final List<?> data;
    private int start= 0;

    public ListIterator(List<?> data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return start<data.size();
    }

    @Override
    public Object next() {
        return data.get(start++);
    }
}
