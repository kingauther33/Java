package com.company;

import java.util.Scanner;

public class Ss5_Ex9 {

    public static void main(String[] args) {
	// write your code here
        int cnt, num;
        for (cnt = 1; cnt <= 10; cnt++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: (0 to stop the loops): ");
            num = Integer.parseInt(sc.nextLine());
            System.out.println("The number you just entered is: " + num);
            if (num == 0) {
                System.out.println("You have entered the escape number, goodbye!!!!");
                break;
            }
        }
    }
}
