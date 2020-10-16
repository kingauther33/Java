package com.company.Ex6;

import com.company.Ex3.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint botRight;

    public MyRectangle(MyPoint topLeft, MyPoint botRight) {
        if ((topLeft.getX() < botRight.getX()) || (topLeft.getY() > botRight.getY())) {
            this.topLeft = topLeft;
            this.botRight = botRight;
        } else throw new IllegalArgumentException("Invalid input");
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBotRight() {
        return botRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBotRight(MyPoint botRight) {
        this.botRight = botRight;
    }

    public String toString() {
        return String.format("MyRectangle=[topLeft=%s,botRight=%s]",
                topLeft.toString(), botRight.toString());
    }

    public double getParameter() {
        return (Math.abs(this.botRight.getX() - this.topLeft.getX()) +
                Math.abs(this.botRight.getY() - this.topLeft.getY())) * 2;
    }

    public double getArea() {
        return (Math.abs(this.botRight.getX() - this.topLeft.getX()) *
                Math.abs(this.botRight.getY() - this.topLeft.getY()));
    }
}
