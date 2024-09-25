package org.example.decorator;

public class ExtraMayoBurger extends BurgerDecorator{
    Burger burger;
    public ExtraMayoBurger(Burger burger)
    {
        this.burger=burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+" with extra mayonese";
    }

    @Override
    public double getCost() {
        return burger.getCost()+15.0;
    }
}
