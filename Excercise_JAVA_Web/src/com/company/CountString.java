package com.company;

import java.util.Scanner;

public class CountString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int letter, space, number, other;
        letter = space = number = other = 0;
        System.out.print("Enter the String: ");
        char[] letters = sc.nextLine().toCharArray();
        for (int i = letters.length - 1; i >= 0; i--) {
            if (Character.isLetter(letters[i])) {
                letter++;
            } else if (Character.isDigit(letters[i])) {
                number++;
            } else if (Character.isSpaceChar(letters[i])) {
                space++;
            } else other++;
        }
        System.out.println("The letters in String: " + letter);
        System.out.println("The numbers in String: " + number);
        System.out.println("The space in String: " + space);
        System.out.println("Other characters in String: " + other);
    }
}
