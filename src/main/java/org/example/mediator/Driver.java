package org.example.mediator;

public class Driver {
    public static void main(String[] args) {
        AuctionMediator auctionMediator=new Auction();
        Colleague colleague1=new Bidder1("A",auctionMediator);
        Colleague colleague2=new Bidder2("B",auctionMediator);
        colleague1.placeBid(1000);
        colleague2.placeBid(2000);
        colleague1.placeBid(3000);

    }
}
