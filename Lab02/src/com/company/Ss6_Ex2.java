package com.company;

public class Ss6_Ex2 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    void changeCustomerAddress() {
        customerAddress = "9999 Streets";
    }

    void displayCustomerInformation () {
        System.out.println("Customer Id: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: " + customerAge);
    }

    public static void main(String[] args) {
	// write your code here
        Ss6_Ex2 objCustomer1 = new Ss6_Ex2();

        objCustomer1.customerID = 100;
        objCustomer1.customerName = "An";
        objCustomer1.customerAddress = "123 StreetK";
        objCustomer1.customerAge = 23;

        objCustomer1.displayCustomerInformation();
        objCustomer1.changeCustomerAddress();
    }
}
