package com.company;

import java.util.Scanner;

public class FractorNum {

    public static void main(String[] args) {
        int num1, cnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        num1 = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= Math.sqrt(num1); i++) {
            if (num1%i==0 && i*i!=num1) {
                cnt += 2;
            } else if (i*i == num1) {
                cnt++;
            }
        }
        System.out.println("The numbers of fractors of num is: " + cnt);
    }
}
