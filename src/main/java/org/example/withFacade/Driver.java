package org.example.withFacade;

import org.example.withFacade.User;

public class Driver {
    public static void main(String[] args) {
        User user=new
                User("Venkatesh","venky@gmail.com","9789564");
        BookingFacade bookingFacade=new BookingFacade();
        bookingFacade.createBooking(user);
    }
}
