package model;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {


    private Recipe list = new Recipe();

    public void setupStage1() {
        list = new Recipe();
    }

    public void setupStage2() {
        Ingredient ingredient1 = new Ingredient();
        ingredient1.setName("Cebolla");
        ingredient1.setWeight(315);
        Ingredient ingredient2 = new Ingredient();
        ingredient2.setName("Ajo");
        ingredient2.setWeight(58);
        Ingredient ingredient3 = new Ingredient();
        ingredient3.setName("Arroz");
        ingredient3.setWeight(520);

        list.addIngredient(ingredient1);
        list.addIngredient(ingredient2);
        list.addIngredient(ingredient3);
    }

    @Test
    public void addIngredientInEmptyListTest() {
        setupStage1();

        Ingredient ingredient = new Ingredient();
        ingredient.setWeight(12);
        ingredient.setName("Sal");
        list.addIngredient(ingredient);

        assertEquals(list.getSize(), 1);
        assertEquals(list.getLast().getName(), "Sal");
        assertEquals(list.getLast().getWeight(), 12);
    }

    @Test
    public void addIngredientWithIngredientsInTheListTest() {
        setupStage2();

        Ingredient ingredient = new Ingredient();
        ingredient.setName("Pimienta");
        ingredient.setWeight(6);

        assertEquals(list.getSize(), 4);
        assertEquals(list.getLast().getName(), "Pimienta");
        assertEquals(list.getLast().getWeight(), 6);
    }

    @Test
    public void addIngredientWithSameNameAndDifferentWeightTest() {
        setupStage2();

        Ingredient ingredient = new Ingredient();
        ingredient.setName("Ajo");
        ingredient.setWeight(21);

        assertEquals(list.getSize(), 3);
        assertEquals(list.getRecipe().get(1).getName(), "Ajo");
        assertEquals(list.getRecipe().get(1).getWeight(), 79);
    }

    @Test
    public void removeIngredientTest() {
        setupStage2();

        list.removeIngredient("Ajo");

        assertEquals(list.getSize(), 2);
        assertEquals(list.getRecipe().get(0).getName(), "Cebolla");
        assertEquals(list.getRecipe().get(1).getName(), "Arroz");
    }
}
