package com.company;

import java.util.Scanner;

public class AreaPolygon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, size;
        double S;
        System.out.print("Enter the number of sided polygon: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the length of one side of the polygon: ");
        size = Integer.parseInt(sc.nextLine());
        S = (n * Math.pow(size, 2)) / (4 * Math.tan(Math.PI/n));
        System.out.printf("The area of %d-sided polygon is: %f", n, S);
    }
}
