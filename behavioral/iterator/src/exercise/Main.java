package exercise;

public class Main {
    public static void main(String[] args) {

        ProductCollections productCollections = new ProductCollections();
        productCollections.push(new Product(1,"shirt"));
        productCollections.push(new Product(2,"socks"));
        productCollections.push(new Product(3,"jean"));

        Iterator<Product> iterator = productCollections.createIterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
