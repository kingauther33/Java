package com.company;

import java.util.Scanner;

public class Excercise62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter the first integer: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the second integer: ");
        num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the third integer: ");
        num3 = Integer.parseInt(sc.nextLine());
        System.out.println(checkNum(num1, num2, num3)
                || checkNum(num2, num1, num3)
                || checkNum(num3, num2, num1));
    }

    public static boolean checkNum(int num1, int num2, int num3) {
        if (num1 > 20) {
            return (num1 < Math.abs(num3 - num2));
        }
        return false;
    }
}
