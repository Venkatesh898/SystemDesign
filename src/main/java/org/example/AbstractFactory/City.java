package org.example.AbstractFactory;

import org.example.AbstractFactory.Car;

public class City implements Car {
    @Override
    public void drive() {
        System.out.println("Driving City car");
    }
}
