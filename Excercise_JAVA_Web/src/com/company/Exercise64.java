package com.company;

import java.util.Scanner;

public class Exercise64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.print("Input the 1st number: ");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.print("Input the 2nd number: ");
            num2 = Integer.parseInt(sc.nextLine());
            if (!(checkInput(num1) && checkInput(num2))) System.out.println("Wrong input, please input again!!");
        } while (!(checkInput(num1) && checkInput(num2)));
        System.out.println(checkCommon(num1, num2));
    }

    public static boolean checkInput(int num) {
        return (num >= 25) && (num <= 75);
    }

    public static boolean checkCommon(int num1, int num2) {
        int x = num1 % 10;
        int y = num2 % 10;
        num1 /= 10;
        num2 /= 10;
        return (num1 == num2) || (num1 == y) || (num2 == x) || (x == y);
    }
}
