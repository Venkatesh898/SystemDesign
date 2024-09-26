package org.example.mediator;

public interface AuctionMediator {
    void addBidder(Colleague bidder);
    void placebid(Colleague bidder ,int bidAmount);

}
