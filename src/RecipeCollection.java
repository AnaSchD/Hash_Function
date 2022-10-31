import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RecipeCollection {

    Set<RecipeCollection> recipeCollections = new HashSet<>();

    public void printRecipeCollection() {
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
