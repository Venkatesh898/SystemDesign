package org.example.withFacade;

import org.example.withFacade.User;

public class TicketSystem {
    int ticketNumber;
    boolean validateAvailability(String st)
    {
        if("movie".equalsIgnoreCase(st))
            return true;
        return false;
    }
    public void createTicket(int tNo, User user, String type)
    {
        ticketNumber=tNo;
        System.out.println("ticket created with Ticket Number : "+tNo);
    }

    public int getTicketNumber() {
        return ticketNumber;
    }
}
