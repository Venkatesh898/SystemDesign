package org.example.FactoryDesignPattern;

public class TestFactory {
    public static void main(String[] args) {
        OSFactory osFactory=new OSFactory();
        OS os=osFactory.getOS("old");
        os.spec();
    }
}
