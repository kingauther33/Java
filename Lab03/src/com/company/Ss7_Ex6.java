package com.company;

public class Ss7_Ex6 {

    public void add(int num1, int num2) {
        System.out.println("Result after addition is: " + (num1 + num2));
    }

    public void add(int num1, int num2, int num3) {
        System.out.println("Result after addition is" + (num1 + num2 + num3));
    }

    public void add(float num1, int num2) {
        System.out.println("Result after addition is: " + (num1 + num2));
    }

    public void add(int num1, float num2) {
        System.out.println("Result after addition is: " + (num1 + num2));
    }

    public void add(float num1, float num2) {
        System.out.println("Result after addtion is: " + (num1 + num2));
    }

    public static void main(String[] args) {
	// write your code here
        Ss7_Ex6 obj = new Ss7_Ex6();
        obj.add(3.4f,1313);
        obj.add(3,6);
        obj.add(3.5f,3.6f);
        obj.add(3,4,5);
    }
}