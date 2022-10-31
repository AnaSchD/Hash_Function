import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RecipeBook {

    private Set <Product> products = new HashSet<Product>();
    private float costOfProducts;
    private String nameOfRecipe;

    public RecipeBook(Set<Product> products, float costOfProducts, String nameOfRecipe) {
        if (products != null && !products.isEmpty()) {
            this.products = products;
        } else {
            throw new RuntimeException("Список продуктов пустой");
        }

        this.costOfProducts = costOfProducts;

        if (!nameOfRecipe.contains(nameOfRecipe)) {
            this.nameOfRecipe = nameOfRecipe;
        } else {
            throw new RuntimeException("Рецепт с таким названием уже существует");
        }
    }

    public void addProductInRecipe(Product product) {
        if (products.contains(product)) {
            throw new RuntimeException("Продукт уже добавлен в рецепт!");
        } else {
            products.add(product);
        }
    }

    public Set<Product> getProducts() {
        return products;
    }

    public float getCostOfProducts() {
        return costOfProducts;
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeBook recipe = (RecipeBook) o;
        return Float.compare(recipe.costOfProducts, costOfProducts) == 0 && Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, costOfProducts, nameOfRecipe);
    }

    @Override
    public String toString() {
        return "RecipeBook{" +
                "products=" + products +
                ", costOfProducts=" + costOfProducts +
                ", nameOfRecipe='" + nameOfRecipe + '\'' +
                '}';
    }
}
