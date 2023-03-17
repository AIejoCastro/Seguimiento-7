package model;

import exceptions.NegativeNumberException;

public class Ingredient {

    private double weight;
    private String name;

    public Ingredient() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWeight(double add) throws NegativeNumberException {
        if (add <= 0) {
            throw new NegativeNumberException();
        } else {
            setWeight(getWeight() + add);
        }
    }

    public void removeWeight(double remove) throws NegativeNumberException{
        if (remove <= 0) {
            throw new NegativeNumberException();
        } else {
            setWeight(getWeight() - remove);
        }
    }
}
