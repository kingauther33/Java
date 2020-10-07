package com.company;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
	// write your code here
        int accountNumber = 100000;
        double accountBalance = 12312.123;
        char accountType = 'S';
        boolean active = true;

        // SOUT
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Active: " + active);
        System.out.println("Account Type (S: Saving C: Current): " + accountType);
        System.out.println("Account Balance: " + accountBalance);

        System.out.println("Nhap so dong: ");
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; ++i, k = 0) {
            for (int space = 1; space <= n - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println("");
        }
    }
}
