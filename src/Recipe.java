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
        for (Product product: products) {
            costOfProducts += product.getPrice();
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
        if (!super.equals(o)) return false;
        Recipe recipe = (Recipe) o;
        return nameOfRecipe.equals(recipe.nameOfRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe);
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
