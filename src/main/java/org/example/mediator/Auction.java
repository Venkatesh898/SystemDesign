package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    List<Colleague> colleagueList=new ArrayList<>();
    @Override
    public void addBidder(Colleague bidder) {
        colleagueList.add(bidder);

    }

    @Override
    public void placebid(Colleague bidder, int bidAmount) {
        for(Colleague colleague:colleagueList)
        {
            if(!colleague.getname().equalsIgnoreCase(bidder.getname()))
            {
                colleague.receiveBidNotification(bidder,bidAmount);
            }
        }

    }
}
