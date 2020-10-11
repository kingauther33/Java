package com.company;

public class Ss7_Ex2 {

    public void setVal(int num1) {
        num1 = num1 + 10;
    }

    public static void main(String[] args) {
	// write your code here
        int num1 = 10;
        Ss7_Ex2 obj = new Ss7_Ex2();
        obj.setVal(num1);
        System.out.println("Value of num1 after invoking setVal is: " + num1);
    }
}