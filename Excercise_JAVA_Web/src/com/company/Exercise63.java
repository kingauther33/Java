package com.company;

import java.util.Scanner;

public class Exercise63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter 1st integer: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter 2nd integer: ");
        num2 = Integer.parseInt(sc.nextLine());
        System.out.println("Result: " + result(num1, num2));
    }

    public static int result(int x, int y) {
        if (x == y) return 0;
        if (x % 6 == y % 6) return Math.min(x, y);
        return Math.max(x, y);
    }
}
