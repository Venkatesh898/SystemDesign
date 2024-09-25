package org.example.decorator;

public class ExtraCheeseBurger extends BurgerDecorator{
    Burger burger;
    public ExtraCheeseBurger(Burger burger)
    {
        this.burger=burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+" With Extra Cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost()+20.0;
    }
}
