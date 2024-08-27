package org.example.IterfaceSegregation;
//The implementing classes should not be forced to provide implementation for unnecessary methods.
//Instead of this based on implementation wise we need to segregate the interfaces.

public interface RestaurantEmployee {
    void serveFood();
    void cleanDishes();
    void cookFood();
}
