package com.example.groupofpeople;

public class RailwayTicketRetiree extends RailwayTicket {
    private float ticketDiscount;

    public RailwayTicketRetiree() {
    }

    public RailwayTicketRetiree(float ticketPrice, int numberOfTicket, float ticketDiscount) {
        super(ticketPrice, numberOfTicket);
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTicket() * (100 - ticketDiscount)) / 100;
    }
}
