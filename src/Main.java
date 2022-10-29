import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product ("", 200.0, 4);
        Product product2 = new Product ("Яблоки", 350.0, 3);
        Product product3 = new Product ("Картошка", 560.0, 6);
        Product product4 = new Product ("Апельсины", 150.0, 5);

        ProductCollection products = new ProductCollection();

        products.addProduct(product1);

        products.addProduct(product2);
        products.addProduct(product3);
        products.addProduct(product4);


       // System.out.println(Arrays.toString(products.getProducts().toArray()));


    }

}