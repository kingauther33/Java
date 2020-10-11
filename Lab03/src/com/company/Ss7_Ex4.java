package com.company;

public class Ss7_Ex4 {

    public void addNumber(int...num) {
        int sum = 0;
        for (int i:num) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers is: " + sum);
    }

    public static void main(String[] args) {
	// write your code here
        Ss7_Ex4 obj = new Ss7_Ex4();
        obj.addNumber(10, 10, 200, 30, 40);
    }
}