package com.tom.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTickets = 0;

        while (totalTickets != -1){
            System.out.println("If you want to stop,please press -1");
            System.out.print("Please enter number of tickets: ");
            totalTickets = scanner.nextInt();

            if(totalTickets == -1) break;

            System.out.print("How many round-trip tickets: ");
            int roundTrip = scanner.nextInt();

            Ticket ticket = new Ticket(totalTickets,roundTrip);
            ticket.print();
        }
        System.out.println("Thank you");

    }
}
