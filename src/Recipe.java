import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe extends RecipeCollection {

    private Set <Product> products = new HashSet<>();
    private float costOfProducts;
    private String nameOfRecipe;

    public Recipe(Set<Product> products, String nameOfRecipe) {
        if (products != null && !products.isEmpty()) {
            this.products = products;
        } else {
            throw new RuntimeException("Список продуктов пустой");
        }
        if (nameOfRecipe != null && !nameOfRecipe.isEmpty()) {
            this.nameOfRecipe = nameOfRecipe;
        } else {
            this.nameOfRecipe = "Нет названия";
        }
    }

    public float calculateSumOfProducts(Recipe recipe) {
        int sum = 0;
        for (Product product: recipe.getProducts()) {
            sum += product.getPrice();
        } return sum;
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
        Recipe recipe = (Recipe) o;
        return Float.compare(recipe.costOfProducts, costOfProducts) == 0 && Objects.equals(products, recipe.products)
                && Objects.equals(nameOfRecipe, recipe.nameOfRecipe);
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
