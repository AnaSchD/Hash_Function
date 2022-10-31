import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product ("Банан", 2.4, 46);
        Product product2 = new Product ("Яблоки", 3.4, 356);
        Product product3 = new Product ("Картошка", 1.7, 65);
        Product product4 = new Product ("Апельсины", 1.8, 55);

        Product potato = new Product("картошка", 2.5, 55);
        Product pork = new Product("свинина", 1.5, 350);
        Product onion = new Product("лук", 0.5, 14);
        Product cabbage = new Product("капуста", 1.1, 55);



        ProductCollection products = new ProductCollection();

        products.addProduct(product1);

        products.addProduct(product2);
        products.addProduct(product3);
        products.addProduct(product4);
        products.printProductCollection();

        ProductCollection shchi = new ProductCollection();

        shchi.addProduct(potato);
        shchi.addProduct(pork);
        shchi.addProduct(onion);
        shchi.addProduct(cabbage);
        var shchi1 = new RecipeCollection();
        System.out.println(shchi1);


       // System.out.println(Arrays.toString(products.getProducts().toArray()));


    }

}