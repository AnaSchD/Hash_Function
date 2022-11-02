import java.util.*;

public class Recipe {

    private Map<Product, Integer> products = new HashMap<>();
    private float costOfProducts;
    private String nameOfRecipe;

    public Recipe(String nameOfRecipe) {

//        if (products != null) {
//            this.products = products;
//        } else {
//            throw new RuntimeException("Список продуктов пустой");
//        }
        if (nameOfRecipe != null && !nameOfRecipe.isEmpty()) {
            this.nameOfRecipe = nameOfRecipe;
        } else {
            this.nameOfRecipe = "Нет названия";
        }
    }

    public void addProductsInRecipe(Product key, Integer value) {
        if (value == null || value <= 0) {
            value = 1;
            this.costOfProducts += value * key.getPrice();
            products.put(key, value);
        }else{
        this.costOfProducts += value * key.getPrice();
        products.put(key, value);
    }}

    public static void calculateSumOfProducts(Recipe recipe) {
        int sum = 0;
        System.out.println(recipe.getProducts().values());

    }

    public Map<Product, Integer> getProducts() {
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


