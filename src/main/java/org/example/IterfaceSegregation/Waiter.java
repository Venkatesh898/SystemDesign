package org.example.IterfaceSegregation;
// If we do not segregate interfaces the client need to forcefully implement all the unnecessary interfaces

public class Waiter implements RestaurantEmployee{
    @Override
    public void serveFood() {
        System.out.println("this is responsibilty of waiter");
    }

    @Override
    public void cleanDishes() {
       System.out.println("this is not the responsibility of waiter");
    }

    @Override
    public void cookFood() {
       System.out.println("This is not responsibility of waiter");
    }
}
