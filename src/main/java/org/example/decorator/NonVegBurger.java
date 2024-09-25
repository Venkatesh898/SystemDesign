package org.example.decorator;

public class NonVegBurger extends Burger{
    @Override
    public String getDescription() {
        return "Non Veg Burger";
    }

    @Override
    public double getCost() {
        return 150.0;
    }
}
