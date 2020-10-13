package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class IntToString {
    public static void main(String[] args) {
        String str;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi bat ki: ");
        str = sc.nextLine();
        System.out.println("Chuoi ban vua nhap la: " + str);
        a = Integer.parseInt(str);
        System.out.printf("Chuoi vua nhap bien doi thanh kieu du lieu INT la: %d\n", a);
    }
}