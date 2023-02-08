package com.example.groupofpeople;

public class RailwayTicketChild extends RailwayTicket {
    private float ticketDiscount;

    public RailwayTicketChild() {
    }

    public RailwayTicketChild(float ticketPrice, int numberOfTicket, float ticketDiscount) {
        super(ticketPrice, numberOfTicket);
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTicket() * (100 - ticketDiscount)) / 100;
    }
}
