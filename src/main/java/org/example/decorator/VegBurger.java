package org.example.decorator;

public class VegBurger extends Burger {
    public String getDescription()
    {
        return "Veg Burger";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
