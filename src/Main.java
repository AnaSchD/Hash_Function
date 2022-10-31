import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product ("Банан", 2, 46);
        Product product2 = new Product ("Яблоки", 1.7, 35);
        Product product3 = new Product ("Картошка", 2.5, 66);
        Product product4 = new Product ("Апельсины", 2.6, 55);

        ProductCollection products = new ProductCollection();

        products.addProduct(product1);

        products.addProduct(product2);
        products.addProduct(product3);
        products.addProduct(product4);

        products.printProductCollection();


       // System.out.println(Arrays.toString(products.getProducts().toArray()));
        Set<RecipeBook> recipes = new HashSet<>();


    }

}