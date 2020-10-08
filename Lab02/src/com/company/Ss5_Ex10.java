package com.company;

import java.util.Scanner;

public class Ss5_Ex10 {

    public static void main(String[] args) {
	// write your code here
        int cnt, square, cube;
        for (cnt = 1; cnt < 300; ++cnt) {
            if (cnt % 3 == 0) continue;
            square = (int) Math.pow(cnt, 2);
            cube = (int) Math.pow(cnt, 3);
            System.out.printf("\nSquare of %d is %d. Cube of %d is %d", cnt, square, cnt, cube);
        }
    }
}
