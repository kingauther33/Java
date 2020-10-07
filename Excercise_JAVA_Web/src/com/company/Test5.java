package com.company;

import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
	// Swap numbers
        int a, b, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap a: ");
        a = scanner.nextInt();
        System.out.print("Moi ban nhap b: ");
        b = scanner.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("a sau khi hoan vi la: " + a);
        System.out.println("b sau khi hoan vi la: " + b);
    }
}
