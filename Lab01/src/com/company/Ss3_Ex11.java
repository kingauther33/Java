package com.company;

public class Ss3_Ex11 {

    public static void main(String[] args) {
	// write your code here
        int x = 23;
        int y = 12;
        //23 = 10111; 12 = 01100
        System.out.print("x & y:");
        System.out.println(x & y); // Returns 4, i.e, 4 = 00100
        System.out.print("x | y:");
        System.out.println(x | y); // Returns 31, i.e 31 = 11111
        System.out.print("x^y:");
        System.out.println(x^y); // Returns 27, ie 27 = 11011
        int a = 43;
        int b = 1;
        System.out.print("a >> b:");
        System.out.println(a >> b); //returns 21, i.e 21 = 0010101
        System.out.print("a << b");
        System.out.println(a << b); //returns 86, ie 86 = 1010110
    }
}
