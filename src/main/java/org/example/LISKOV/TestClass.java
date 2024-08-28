package org.example.LISKOV;

import org.example.LISKOV.Bicycle;
import org.example.LISKOV.Car;
import org.example.LISKOV.MotorCycle;
import org.example.LISKOV.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Vehicle> list=new ArrayList<>();
        list.add(new MotorCycle());
        list.add(new Car());
        list.add(new Bicycle());
        for (Vehicle v: list)
        {
            //System.out.println(v.engineType().toString());
        }
    }
}
