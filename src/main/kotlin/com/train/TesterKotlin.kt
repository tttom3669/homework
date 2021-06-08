package com.train

import java.util.*

fun main() {
    val scn = Scanner(System.`in`)

    print("Please enter number of tickets: ")
    val totalTickets = scn.nextInt()

    print("How many Round-trip tickets: ")
    val roundTrip = scn.nextInt()

    var ticket = Ticketk(totalTickets,roundTrip)
    ticket.print()
}

class Ticketk(var totalTickets : Int,var roundTrip : Int){
    fun print(){
        val total = ((totalTickets-roundTrip)*1000 + (roundTrip*2000)*0.9).toInt();

        print("Total tickets: " + totalTickets + "\n" +
        "Round-trip: " + roundTrip + "\n" + "Total: " + total)
    }
}