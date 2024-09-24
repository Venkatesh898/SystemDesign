package org.example.withoutFacade;

public class NotificationSystem {
    public void smsNotification( User user, int ticketNumber)
    {
        System.out.
                println("SMS is sent as notification for user with Mobile Number:"+user.getPhoneNumber()
                +"with Ticket Number:"+ticketNumber);
    }
    public void EmailNotification( User user, int ticketNumber)
    {
        System.out.
                println("notification sent on email for user with Email Id :"+user.getEmail()
                        +"with Ticket Number:"+ticketNumber);
    }



}
