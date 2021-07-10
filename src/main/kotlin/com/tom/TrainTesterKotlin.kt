package com.tom

import java.util.*

fun main() {
    val scn = Scanner(System.`in`)
    var totalTickets = 0;

    while (totalTickets != -1 ){
        println("If you want to stop,please press -1")
        print("Please enter number of tickets: ")
        totalTickets = scn.nextInt()

        if (totalTickets == -1) break

        print("How many Round-trip tickets: ")
        var roundTrip = scn.nextInt()
        var ticket = Ticketk(totalTickets,roundTrip)
        ticket.print()
    }
    println("Thank you")



}

class Ticketk(var totalTickets : Int,var roundTrip : Int){
    fun print(){
        val total = ((totalTickets-roundTrip)*1000 + (roundTrip*2000)*0.9).toInt();

        println("Total tickets: " + totalTickets + "\n" +
        "Round-trip: " + roundTrip + "\n" + "Total: " + total)
    }
}