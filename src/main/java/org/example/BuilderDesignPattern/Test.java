package org.example.BuilderDesignPattern;

public class Test {
    public static void main(String[] args) {
        //Dog dog=new Dog("male","GS");
        Dog dog=new Dog.DogBuilder().setBreed("GS").Gender("male").setPrice(320000.00).build();


        System.out.println(dog);

    }

}
