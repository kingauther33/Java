package com.company;

import java.util.*;

public class Withdraw {
    public static void main(String[] args) {
        //CODE
        double balance = 100000;
        double withdraw;
        String active = "Y";
        System.out.println("Current amount balance: " + balance);
        System.out.println("Enter the amount to withdraw: $");
        Scanner scanner = new Scanner(System.in);
        withdraw = scanner.nextDouble();
        while (active.equalsIgnoreCase("Y")) {
            if (withdraw > 0) {
                balance -= withdraw;
                System.out.printf("Transaction Successful, Your Current Account Balance: %.2f \nDo you want to withdraw more? (Y/N)", balance);
                scanner.nextLine();
                active = scanner.nextLine();
            } else {
                System.out.println("Transaction Fail, Your Current Account Balance: %.2f \nDo you want to withdraw again? (Y/N)");
                scanner.nextLine();
                active = scanner.nextLine();
            }
        }
    }
}
