package org.example.AbstractFactory;

public class HondaFactory implements CarFactory{
    @Override
    public Car createCar(String carType) {
        if(carType.equalsIgnoreCase("city"))
            return new City();
        if(carType.equalsIgnoreCase("amaze"))
            return new Amaze();
        return null;
    }
}
