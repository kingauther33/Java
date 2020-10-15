package com.company.Ex4;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(1, 4, 3);
        System.out.println(c1);
        System.out.println(c1.getCenterX());
        System.out.println(c1.getCenterY());
        System.out.println(c1.distance(new MyCircle(3, 4, 2)));
    }
}
