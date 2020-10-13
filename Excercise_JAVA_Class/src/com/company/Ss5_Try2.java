package com.company;

import java.util.Scanner;

public class Ss5_Try2 {
    public static void main(String[] args) {
        // Tao cac dong * voi so dong bat ki
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so dong cua tam giac: ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; ++i) {
            for (int k = 1; k <= n; ++k) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
