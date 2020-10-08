package com.company;

public class Ss5_Ex12 {

    public static void main(String[] args) {
	// write your code here
        outer:
            for (int i = 1; i < 5; i++) {
                for (int j = 1; j < 5; j++) {
                    if (j > i) {
                        System.out.println();
                        continue outer;
                    }
                    System.out.print(j);
                }
                System.out.println("This is outter loop!!");
            }
        System.out.println("Goodbye!");
    }
}
