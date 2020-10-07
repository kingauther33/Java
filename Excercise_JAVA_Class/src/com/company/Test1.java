package com.company;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //CODE
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextInt();
        System.out.println("Nhap b: ");
        b = scanner.nextInt();
        System.out.println("Tong a va b la: " + (a+b));
        System.out.println("\n\n\n");


        int i = 5;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
    }
}
