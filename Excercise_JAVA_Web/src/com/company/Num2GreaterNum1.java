package com.company;

import java.util.Scanner;

public class Num2GreaterNum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b,c ;
        System.out.print("Moi ban nhap a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap b: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap c: ");
        c = Integer.parseInt(sc.nextLine());
        System.out.println("The result is: " + checkRightNum(a, b, c));
    }

    public static boolean checkRightNum (int a, int b, int c) {
        return  ((a % 10) == (b % 10) ||
                (b % 10) == (c % 10) ||
                (a % 10) == (c % 10));
    }
}