package com.company;

import java.util.Scanner;

public class Excercise60 {

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        s = sc.nextLine();
        String[] words = s.split("[ ]+",0);
        System.out.println("The Penultimate word is: " + words[words.length - 2]);
    }
}
