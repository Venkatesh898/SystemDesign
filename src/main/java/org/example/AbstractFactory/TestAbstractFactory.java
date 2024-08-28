package org.example.AbstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        CarFactory hondaCarFactory=FactoryProducer.getCarFactory("honda");
        Car amaze=hondaCarFactory.createCar("amaze");
        amaze.drive();
        Car city=hondaCarFactory.createCar("city");
        city.drive();
        CarFactory hyundaiCarFactory= FactoryProducer.getCarFactory("hyundai");
        Car verna=hyundaiCarFactory.createCar("verna");
        verna.drive();
    }
}
