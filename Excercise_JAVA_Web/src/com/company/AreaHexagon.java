package com.company;

import java.util.Scanner;

public class AreaHexagon {
    public static void main(String[] args) {
        int size;
        double S;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of a side of the hexagon: ");
        size = Integer.parseInt(sc.nextLine());
        S = (6 * Math.pow(size, 2) / (4 * Math.tan(Math.PI/6)));
        System.out.println("Area of the hexagon is: " + S);
    }
}
