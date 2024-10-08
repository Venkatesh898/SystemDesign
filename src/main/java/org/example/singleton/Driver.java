package org.example.singleton;

public class Driver {
    public static void main(String[] args) {
//        SingleTonClass obj1=SingleTonClass.getInstance();
//        SingleTonClass obj2=SingleTonClass.getInstance();
//        System.out.println(obj1 + " "+ obj2);
        new Thread(()->SingleTonClass.getInstance()).start();
        new Thread(()->SingleTonClass.getInstance()).start();


    }
}
