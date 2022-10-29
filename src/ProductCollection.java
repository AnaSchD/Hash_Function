import java.util.ArrayList;
import java.util.List;

public class ProductCollection {

    List<Product> products = new ArrayList<>();

    public void addProductsToTheBucket(Product product) {
        products.add(product);
    }

    public void removeProductsFromTheBucket(Product product) {
        if (!products.equals(product)) {

        }
    }


}
