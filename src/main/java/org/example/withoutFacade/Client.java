package org.example.withoutFacade;

public class Client {
    public static void main(String[] args) {
        User user=new User("Venkatesh","venky@gmail.com","9789564");
        TicketSystem ts=new TicketSystem();
        boolean isBookingpossible=ts.validateAvailability("movie");
        if(isBookingpossible)
        {
            ts.createTicket(100,user,"movie");
            PaymentSystem ps= new PaymentSystem();
            ps.chargeCard();
            NotificationSystem ns=new NotificationSystem();
            ns.smsNotification(user,ts.getTicketNumber());
            ns.EmailNotification(user,ts.getTicketNumber());
        }
    }
}
