package com.train;

public class Ticket {
    int totalTickets;
    int roundTrip;

    public Ticket(int totalTickets, int roundTrip) {
        this.totalTickets = totalTickets;
        this.roundTrip = roundTrip;
    }

    public void print(){
        int total =(int) ((totalTickets-roundTrip)*1000 + roundTrip*2000*0.9);
        System.out.println("Total tickets: " + totalTickets + "\n" +
                "Round-trip: " + roundTrip + "\n" + "Total:" + total);
   }
}
