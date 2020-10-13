package com.company;

import java.util.Scanner;

public class Ss6_Try02_1210 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    void initialize(int cusID, String cusName, String cusAdd, int cusAge) {
        customerID = cusID;
        customerName = cusName;
        customerAddress = cusAdd;
        customerAge = cusAge;
    }

    void display() {
        System.out.println("Ma khach hang: " + customerID);
        System.out.println("Ten khach hang: " + customerName);
        System.out.println("Dia chi cua khach hang: " + customerAddress);
        System.out.println("Tuoi cua khach hang: " + customerAge);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Ss6_Try02_1210 obj = new Ss6_Try02_1210();
        obj.initialize(101, "Tung", "100 Hang Mam", 23);
        Ss6_Try02_1210 obj2 = new Ss6_Try02_1210();
        obj2.initialize(102, "Toan", "100 Hang Be", 24);
        obj.display();
        obj2.display();

        System.out.printf("Nhap lai so tuoi cua %s: ", obj.customerName);
        Scanner sc = new Scanner(System.in);
        obj.customerAge = Integer.parseInt(sc.nextLine());
        obj.display();

        System.out.printf("Nhap lai so tuoi cua %s: ", obj2.customerName);
        obj.customerAge = Integer.parseInt(sc.nextLine());
        obj2.display();
        System.out.println();
    }
}
