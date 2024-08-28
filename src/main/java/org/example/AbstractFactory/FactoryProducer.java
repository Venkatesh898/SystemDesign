package org.example.AbstractFactory;

public class FactoryProducer {
    public static CarFactory getCarFactory(String factoryType)
    {
        if(factoryType.equalsIgnoreCase("honda"))
            return new HondaFactory();
        if(factoryType.equalsIgnoreCase("hyundai"))
            return new HyundaiCarFactory();
        return null;
    }

}
