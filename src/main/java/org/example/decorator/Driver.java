package org.example.decorator;

public class Driver {
    public static void main(String[] args) {
        Burger burger=new NonVegBurger();
        System.out.println(burger.getDescription()+" ,"+burger.getCost());
        burger=new ExtraCheeseBurger(burger);
        System.out.println(burger.getDescription()+" ,"+burger.getCost());
        burger=new ExtraMayoBurger(burger);
        burger=new ExtraMayoBurger(burger);
        System.out.println(burger.getDescription()+" ,"+burger.getCost());
    }
}
