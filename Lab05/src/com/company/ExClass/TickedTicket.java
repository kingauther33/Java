package com.company.ExClass;

import java.util.Scanner;

public class TickedTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String depDate, depTime;
        Date date = new Date();

        FlightTicket flightTicket = new FlightTicket();

        System.out.print("Enter departure date (mm dd yyyy): ");
        depDate = sc.nextLine();
        System.out.print("Enter departure time (hh mm): ");
        depTime = sc.nextLine();
        System.out.println("Enter the type of cabin:");
        System.out.println("1. Business");
        System.out.println("2. First");
        System.out.println("3. Economy");
        flightTicket.inputTypeCabin();
        System.out.print("Enter the numbers of tickets: ");
        flightTicket.inputNumTickets();
        flightTicket.testTypeCabin();

        System.out.println("------------------------------------------------------ ");
        depDate = depDate.replace(' ', '/');
        depTime = depTime.replace(' ', ':');
        System.out.println("Departure Date: " + depDate);
        System.out.println("Departure Time: " + depTime);
        System.out.println("Number of tickets: " + flightTicket.getNumTicket());
        System.out.println("Type of cabin: " + flightTicket.getType());
        System.out.println("Total cost of the ticket: " + flightTicket.cost());
    }
}
