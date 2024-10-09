package exercise;

import java.util.ArrayList;
import java.util.List;

public class ProductCollections {

    private final List<Product> products = new ArrayList<>();

    public void push(Product product) {
        products.add(product);
    }

    public Product pop() {

        if (!products.isEmpty())
            return products.remove(products.size() - 1);

        return null;
    }

    public Iterator<Product> createIterator() {
        return new ListIterator<>(products);
    }

    private static class ListIterator<T> implements Iterator<T> {

        private int count = 0;

        private final List<T> list;

        private ListIterator(List<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return count < list.size();
        }

        @Override
        public T next() {
            return list.get(count++);
        }
    }
}
