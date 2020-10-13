package com.company;

import java.util.Scanner;

public class Ss5_Try1 {
    public static void main(String[] args) {
        // Tao tam giac can voi so dong bat ki
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so dong cua tam giac: ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; ++i) {
            for (int k = 1; k <= i; ++k) {
                System.out.printf("%d ", k);
            }
            System.out.println();
        }
    }
}
