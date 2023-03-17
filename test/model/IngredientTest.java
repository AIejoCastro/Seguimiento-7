package model;

import exceptions.NegativeNumberException;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {

    private Ingredient ingredient = new Ingredient();

    public void setupStage1() {
        ingredient.setName("Tomate");
        ingredient.setWeight(245);
    }

    @Test
    public void addWeightTest() {
        setupStage1();

        ingredient.addWeight(54);

        assertEquals(ingredient.getWeight(), 299);
    }

    @Test
    public void addNegativeNumberToWeightTest() {
        setupStage1();

        assertThrows(NegativeNumberException.class, ()->{
            ingredient.addWeight(-100);
        });
    }

    @Test
    public void removeWeightTest() {
        setupStage1();

        ingredient.removeWeight(45);

        assertEquals(ingredient.getWeight(), 200);
    }

    @Test
    public void removeNegativeNumberToWeightTest() {
        setupStage1();

        assertThrows(NegativeNumberException.class, ()->{
            ingredient.removeWeight(-100);
        });
    }


}
