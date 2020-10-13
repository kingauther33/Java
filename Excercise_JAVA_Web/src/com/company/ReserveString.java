package com.company;

import java.util.Scanner;

public class ReserveString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        char[] letters = sc.nextLine().toCharArray();
        System.out.print("Reserve string is: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
