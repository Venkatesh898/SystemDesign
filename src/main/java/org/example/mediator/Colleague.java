package org.example.mediator;

public interface Colleague {
    void placeBid(int bidAmount);
    String getname();
    void receiveBidNotification(Colleague bidder,int bidAmount);
}
