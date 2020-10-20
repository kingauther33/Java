package com.company;

import java.util.Scanner;

public class Excercise59 {

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to change case: ");
        s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println(s);
    }
}
