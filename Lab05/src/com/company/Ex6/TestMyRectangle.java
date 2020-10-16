package com.company.Ex6;

import com.company.Ex3.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(5, 1);
        MyRectangle r1;
        try {
             r1 = new MyRectangle(p1, p2);
        } catch (IllegalArgumentException ex) {
            r1 = new MyRectangle(p2, p1);
            ex.printStackTrace();
            System.out.println("Error in input, Please enter the r1 again.");
        }

        System.out.println(r1);
        System.out.println("Parameter of the rectangle is: " + r1.getParameter());
        System.out.println("Area of the rectangle is: " + r1.getArea());
    }
}
