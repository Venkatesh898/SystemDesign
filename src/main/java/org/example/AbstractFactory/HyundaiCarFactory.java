package org.example.AbstractFactory;

public class HyundaiCarFactory implements  CarFactory{
    @Override
    public Car createCar(String carType) {
        if(carType.equalsIgnoreCase("creta"))
            return new Creta();
        if(carType.equalsIgnoreCase("verna"))
            return new Verna();
        return null;
    }
}
