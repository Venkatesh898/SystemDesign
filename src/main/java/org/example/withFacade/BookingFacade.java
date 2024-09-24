package org.example.withFacade;

import org.example.withFacade.NotificationSystem;
import org.example.withFacade.PaymentSystem;
import org.example.withFacade.TicketSystem;

public class BookingFacade {
    public void createBooking(User user)
    {
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
