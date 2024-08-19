package org.example.WithoutLISKOV;

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
            System.out.println(v.engineType().toString());
        }
    }
}
