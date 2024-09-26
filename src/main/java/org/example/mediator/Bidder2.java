package org.example.mediator;

public class Bidder2 implements Colleague {
    String name;
    AuctionMediator auctionMediator;
    public Bidder2(String name,AuctionMediator auctionMediator)
    {
        this.name=name;
        this.auctionMediator=auctionMediator;
        auctionMediator.addBidder(this);
    }
    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placebid(this,bidAmount);

    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public void receiveBidNotification(Colleague bidder, int bidAmount) {
        System.out.
                println("Bidder "+name+" got the notification from :"+bidder.getname()+" for an Amount of:"+bidAmount);
    }
}
