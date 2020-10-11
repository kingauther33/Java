package com.company;

class Circle {
    public double getPI() {
        return 3.14;
    }
}

public class Ss7_Ex3 {

    public void calArea(Circle objPi, double rad) {
        double area = objPi.getPI() * rad * rad;
        System.out.println("Area of the circle: " + area);
    }

    public static void main(String[] args) {
	// write your code here
        Ss7_Ex3 p1 = new Ss7_Ex3();
        p1.calArea(new Circle(), 2);
    }
}