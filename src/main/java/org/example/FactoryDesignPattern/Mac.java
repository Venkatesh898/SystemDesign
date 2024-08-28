package org.example.FactoryDesignPattern;

public class Mac implements OS{
    @Override
    public void spec() {
        System.out.println("OS from Apple");
    }
}
