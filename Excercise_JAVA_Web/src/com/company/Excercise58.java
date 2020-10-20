package com.company;

import java.util.Scanner;

public class Excercise58 {

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to change case: ");
        s = sc.nextLine();
        String upperCase = "";
        Scanner lineScan = new Scanner(s);
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upperCase.trim());
    }
}
