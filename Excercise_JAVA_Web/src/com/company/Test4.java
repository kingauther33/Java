package com.company;

public class Test4 {

    public static void main(String[] args) {
	// America Flag
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 20; j++) {
                if ((j <= 6) && (i % 2 == 1)) System.out.print("* ");
                else if ((j <= 5) && (i % 2 == 0)) System.out.print(" *");
                else if ((j == 6) && (i % 2 == 0)) System.out.print("  ");
                else System.out.print("=");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 26; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
