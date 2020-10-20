package com.company.ExClass;

import java.util.Scanner;

public class FlightTicket {
    Scanner sc = new Scanner(System.in);
    private int numTickets;
    private final double ticketPriceBase = 1000.00;
    private int typeCabin;
    private int typeCost;

    public int getType() {
        return typeCabin;
    }

    public int getNumTicket() {
        return numTickets;
    }

    public double cost() {
        return numTickets *  ticketPriceBase * typeCost;
    }

    public void inputTypeCabin() {
        typeCabin = Integer.parseInt(sc.nextLine());
    }

    public void inputNumTickets() {
        numTickets = Integer.parseInt(sc.nextLine());
    }

    public void testTypeCabin() {
        switch (typeCabin) {
            case 1:
                typeCost = 1;
                break;
            case 2:
                typeCost = 2;
                break;
            case 3:
                typeCost = 3;
                break;
        }
    }
}
