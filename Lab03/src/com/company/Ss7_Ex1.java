package com.company;

public class Ss7_Ex1 {

    public void add(int num1, int num2) {
        int num3;
        num3 = num1 + num2;
        System.out.println("Result after addition is " + num3);
    }

    public void sub(int num1, int num2) {
        int num3;
        num3 = num1 - num2;
        System.out.println("Result after subtract is: " + num3);
    }

    public void mul (int num1, int num2) {
        int num3;
        num3 = num1 * num2;
        System.out.println("Result after multiply: " + num3);
    }

    public void div (int num1, int num2) {
        int num3;
        num3 = num1 / num2;
        System.out.println("Result after division: " + num3);
    }

    public static void main(String[] args) {
	// write your code here
        Ss7_Ex1 cal = new Ss7_Ex1();
        cal.add(3, 4);
        cal.sub(3, 4);
        cal.mul(3, 4);
        cal.div(3, 4);
    }
}