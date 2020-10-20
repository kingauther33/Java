package com.company.Eg;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Radius is: " + c1.getRadius());
        System.out.println("Height is: " + c1.getHeight());
        System.out.println("Color is: " + c1.getColor());
        System.out.println("Base Area is: " + c1.getArea());
        System.out.println("Volume is: " + c1.getVolume());

        Cylinder c2 = new Cylinder(5.0, 2.0);
        System.out.println("Radius is: " + c2.getRadius());
        System.out.println("Height is: " + c2.getHeight());
        System.out.println("Color is: " + c2.getColor());
        System.out.println("Base Area is: " + c2.getArea());
        System.out.println("Volume is: " + c2.getVolume());
    }
}
