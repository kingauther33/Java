package com.company;

public class CountUniqueNumbers {
    public static void main(String[] args) {
        int cnt = 0;
        System.out.println("The unique numbers from 1, 2, 3, 4 are: ");
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= 4; k++) {
                for (int j = 1; j <= 4; j++) {
                    if ((i != k) && (i != j) && (j != k)) {
                        cnt++;
                        System.out.println(i + "" + k + "" + j);
                    }
                }
            }
        }
        System.out.println("Total amount of unique numbers from 1, 2 ,3 ,4: " + cnt);
    }
}
