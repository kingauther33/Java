package com.company.Eg;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Constructed a Circle with Circle()");
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
        System.out.println("Constructed a Circle with Circle(radius)");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Constructed a Circle with Circle(radius, color)");
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return String.format("Circle[radius=%.2f,color=%s]", radius, color);
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
