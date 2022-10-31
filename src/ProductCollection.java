import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ProductCollection {

    Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {

        if (products.contains(product)) {
            throw new RuntimeException("Этот продукт уже есть в списке продуктов ");
        } else {
            products.add(product);
        }
    }

    public void printProductCollection() {
        for (Product prod : products) {
            System.out.println(prod.getName() + " стоимостью " + prod.getPrice() + " руб.," + " и весом " + prod.getWeight() + " кг.");
        }
    }

    public ProductCollection() {
        this.products = products;
    }

    public void remove(Product product) {
        products.remove(product);
    }

    @Override
    public String toString() {
        return "ProductCollection{" +
                "products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCollection that = (ProductCollection) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
