package com.company;

public class Ss5_Ex7 {

    public static void main(String[] args) {
	// write your code here
        int num = 1;
        boolean flag = false;
        for (; !flag; num++) {
            System.out.printf("Value of num: %d\n", num);
            if (num == 5) flag = true;
        }
    }
}
