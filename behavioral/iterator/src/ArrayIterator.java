import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class ArrayIterator implements Iterator<Object> {

    private final Object[] arrays ;
    private int start =0;

    public ArrayIterator(Object[] arrays){
        this.arrays = arrays;
    }
    @Override
    public boolean hasNext() {
        return start<arrays.length;
    }

    @Override
    public Object next() {
        return arrays[start++];
    }
}
