package com.company;

import java.util.Scanner;

public class Ss6_Try1 {
    public static void main(String[] args) {
	// write your code here
        Point point = new Point();
        point.displayPoints();
    }
}

class Point {
    Scanner sc = new Scanner(System.in);
    int x, y;
    int xBase = 10;
    int yBase = 20;

    Point() {
        System.out.print("Please enter value of X: ");
        x = Integer.parseInt(sc.nextLine());
        System.out.print("Please enter value of Y: ");
        y = Integer.parseInt(sc.nextLine());
    }

    void displayPoints () {
        System.out.println("X location: " + x);
        System.out.println("Y location: " + y);
        if ((x == xBase) && (y == yBase))
            System.out.println("Points are same!");
        else
            System.out.println("Points are different!");
    }
}
