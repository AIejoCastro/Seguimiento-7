package model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Recipe {

    private LinkedList<Ingredient> recipe;

    public Recipe() {
        recipe = new LinkedList<>();
    }

    public LinkedList<Ingredient> getRecipe() {
        return recipe;
    }

    public void setRecipe(LinkedList<Ingredient> recipe) {
        this.recipe = recipe;
    }

    public void addIngredient(Ingredient ingredient) {
        for(int i = 0; i < recipe.size(); i++) {
            if (recipe.get(i).getName().equals(ingredient.getName())) {
                recipe.get(i).setWeight(recipe.get(i).getWeight() + ingredient.getWeight());
                return;
            }
        }
        recipe.add(ingredient);
    }

    public void removeIngredient(String ingredient) {
        for (int i = 0; i < recipe.size(); i++) {
            if (recipe.get(i).getName().equals(ingredient)) {
                recipe.remove(i);
            }
        }
    }

    public int getSize() {
        return recipe.size();
    }

    public Ingredient getLast() {
        return recipe.getLast();
    }
}
