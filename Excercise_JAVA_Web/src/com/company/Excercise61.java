package com.company;

import java.util.Scanner;

public class Excercise61 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.print("Enter a word: ");
        word = sc.nextLine();
        word = word.trim();
        String result = "";
        char[] ch = word.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }

        System.out.println("Reserve word is: " + result.trim());
    }
}
