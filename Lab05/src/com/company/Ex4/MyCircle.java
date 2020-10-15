package com.company.Ex4;

import com.company.Ex3.MyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        center = new MyPoint(0,0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        int[] results = new int[2];
        results[0] = this.center.getX();
        results[1] = this.center.getY();
        return results;
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public String toString() {
        return String.format("MyCircle[radius=%d,%s", radius, center.toString());
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
}
