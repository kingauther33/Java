package com.company;

import java.util.Scanner;

public class Ss5_Try4 {

    public static void main(String[] args) {
	// write your code here
        int a, remainder, sumDigits = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so bat ki: ");
        a = Integer.parseInt(sc.nextLine());
        temp = a;
        do {
            remainder = temp % 10;
            sumDigits += remainder;
            temp = temp / 10;
        } while (temp > 0);
        System.out.printf("Tong cac chu so cua so %d la: %d", a, sumDigits);
    }
}
