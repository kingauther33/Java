package com.company;

public class Ss6_Ex1 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    public static void main(String[] args) {
	// write your code here
        Ss6_Ex1 objCustomer1 = new Ss6_Ex1();

        objCustomer1.customerID = 100;
        objCustomer1.customerName = "An";
        objCustomer1.customerAddress = "123 StreetK";
        objCustomer1.customerAge = 23;

        System.out.println("Customer Id: " + objCustomer1.customerID);
        System.out.println("Customer Name: " + objCustomer1.customerName);
        System.out.println("Customer Address: " + objCustomer1.customerAddress);
        System.out.println("Customer Age: " + objCustomer1.customerAge);
    }
}
