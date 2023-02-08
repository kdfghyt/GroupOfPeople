package com.example.groupofpeople;

public class RailwayTicket {
    private String departurePoint;
    private String arrivePoint;
    private String departureDate;
    private String arriveDate;
    private String travelTime;
    private int distance;
    private float ticketPrice;
    private int numberOfTicket;

    public RailwayTicket() {

    }

    public RailwayTicket(float ticketPrice, int numberOfTicket) {
        this.ticketPrice = ticketPrice;
        this.numberOfTicket = numberOfTicket;
    }

    public float ticketPriceAll() {
        return ticketPrice * numberOfTicket;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice() {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket() {
        this.numberOfTicket = numberOfTicket;
    }
}
