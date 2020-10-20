package com.company;

import java.util.Scanner;

public class Range2NumDiv {
    private int num1, num2, num3;
    Scanner sc = new Scanner(System.in);

    public void inputNums() {
        System.out.print("Enter num1: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter num2: ");
        num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter num3: ");
        num3 = Integer.parseInt(sc.nextLine());
    }

    public void displayNums() {
        System.out.println("Num1 you just entered is: " + num1);
        System.out.println("Num2 you just entered is: " + num2);
        System.out.println("Num3 you just entered is: " + num3);
    }

    public void checkDivNum3() {
        int temp, count = 0;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++) {
            if (i % num3 == 0) count++;
        }
        System.out.println("The numbers betweeen num1 and num2 and can div num3 is: " + count);
    }

    public static void main(String[] args) {
	// Swap numbers
        Range2NumDiv obj1 = new Range2NumDiv();
        obj1.inputNums();
        obj1.displayNums();
        obj1.checkDivNum3();
    }
}
