package com.company;

import java.util.*;

public class Order {
    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }

    public static void main(String[] args) {
        int shirtAmount, trouserAmount;
        int shirtPrice, trouserPrice;
        int shirtTotal, trouserTotal, total;
        double point, discount;
        shirtPrice = 300;
        trouserPrice = 700;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Shirts to order:");
        shirtAmount = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the number of Trousers to order:");
        trouserAmount = Integer.parseInt(sc.nextLine());
        shirtTotal = shirtPrice * shirtAmount;
        trouserTotal = trouserPrice * trouserAmount;
        total = shirtTotal + trouserTotal;
        discount = (total >= 3000) ? total / 10.0 : 0;
        point = (total - discount) / 100.0;

        System.out.println(padRight("Item", 20) + padRight("Quantity", 15) + padRight("Price", 15) + padRight("Total", 15));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(padRight("Shirts", 20) + padRight(Integer.toString(shirtAmount), 15) + padRight(Integer.toString(shirtPrice), 15) + padRight(Integer.toString(shirtTotal), 15));
        System.out.println(padRight("Trousers", 20) + padRight(Integer.toString(trouserAmount), 15) + padRight(Integer.toString(trouserPrice), 15) + padRight(Integer.toString(trouserTotal), 15));
        System.out.println(padRight("Discount", 50) + discount);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(padRight("Net Total", 50) + (total - discount));
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Points Earned\t" + point);
    }
}
