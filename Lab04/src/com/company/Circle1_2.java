package com.company;

public class Circle1_2 {
    private double radius;

    public Circle1_2() {
        radius = 1.0;
    }
    public Circle1_2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return Math.PI;
    }
    public String toString() {
        return "Circle[radius: " + radius + "]";
    }
}
