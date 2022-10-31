import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RecipeCollection {

    public static Set<Recipe> recipeCollections = new HashSet<>();

    public void addRecipeInRecipeCollection(Recipe recipe) {

        if (recipeCollections != null && !recipeCollections.isEmpty()) {
            for (Recipe currentRecipe : recipeCollections) {
                if (currentRecipe.getNameOfRecipe().equals(recipe.getNameOfRecipe())) {
                    throw new IllegalArgumentException("Рецепт с таким названием уже существует!!");
                } else {
                    recipeCollections.add(recipe);
                }
            }
        } else {
            recipeCollections.add(recipe);
        }

    }

    public void printAllRecipeCollection() {
        System.out.println("Все рецепты: ");



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCollection that = (RecipeCollection) o;
        return Objects.equals(recipeCollections, that.recipeCollections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeCollections);
    }

    @Override
    public String toString() {
        return "RecipeCollection{" +
                "recipeCollections=" + recipeCollections +
                '}';
    }
}
