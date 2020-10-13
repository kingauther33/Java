package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class ConvertSeconds {
    public static void main(String[] args) {
        int seconds;
        int p1, p2 ,p3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seconds you want to convert: ");
        seconds = Integer.parseInt(sc.nextLine());
        p1 = seconds % 60;
        p2 = seconds / 60;
        p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print(p2 + ":" + p3 + ":" + p1);
        System.out.println();
    }
}