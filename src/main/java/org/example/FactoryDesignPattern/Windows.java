package org.example.FactoryDesignPattern;

public class Windows implements OS{
    @Override
    public void spec() {
        System.out.println("MicroSoft Product");
    }
}
