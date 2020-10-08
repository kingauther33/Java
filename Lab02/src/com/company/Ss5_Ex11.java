package com.company;

public class Ss5_Ex11 {

    public static void main(String[] args) {
	// write your code here
        int i;
        outer:
            for (i = 1; i <= 5; ++i) {
                if (i == 4) {
                    System.out.println("Condition is met, outta of the loop from here!!");
                    break outer;
                }
                System.out.println("This is inside the loop");
            }
        System.out.println("Good bye!!");
    }
}
