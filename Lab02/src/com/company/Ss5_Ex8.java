package com.company;

public class Ss5_Ex8 {

    public static void main(String[] args) {
	// write your code here
        int row, col;
        for (row = 1; row <= 5; ++row) {
            for (col = 1; col <= row; ++col) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
