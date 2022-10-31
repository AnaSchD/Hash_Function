import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product ("Банан", 2.4, 46);
        Product product2 = new Product ("Яблоки", 3.4, 356);
        Product product3 = new Product ("Картошка", 1.7, 65);
        Product product4 = new Product ("Апельсины", 1.8, 55);



        Product potato = new Product("картошка", 2.5, 55);
        Product pork = new Product("свинина", 1.5, 350);
        Product onion = new Product("лук", 0.3, 14);
        Product cabbage = new Product("капуста", 1.1, 55);
        Product carrot = new Product("морковь", 0.2, 19);
        Product carrot1 = new Product("морковь", 0.2, 19);


        Set <Product> recipe = new HashSet<>();
        recipe.add(pork);
        recipe.add(potato);
        recipe.add(onion);
        recipe.add(cabbage);
        recipe.add(carrot);

        Set <Product> recipe01 = new HashSet<>();
        recipe01.add(pork);
        recipe01.add(onion);
        recipe01.add(carrot1);

        Recipe recipe1 = new Recipe(recipe, "Shchi");
        Recipe recipe2 = new Recipe(recipe01, "Shchi8");
       // Recipe recipe2 = new Recipe(recipe01, "Shchi");

        RecipeCollection recipeCollection = new RecipeCollection();


        recipeCollection.addRecipeInRecipeCollection(recipe1);
        recipeCollection.addRecipeInRecipeCollection(recipe2);

        System.out.println(recipeCollection);











//        ProductCollection products = new ProductCollection();
//
//        products.addProduct(product1);
//
//        products.addProduct(product2);
//        products.addProduct(product3);
//        products.addProduct(product4);
//        products.printProductCollection();











    }

}