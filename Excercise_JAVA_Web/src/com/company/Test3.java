package com.company;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
	// Parameter + Area of Circle
        Scanner scanner = new Scanner(System.in);
        double w, h, S, P;
        System.out.println("Moi ban nhap chieu rong cua hinh chu nhat: ");
        h = scanner.nextDouble();
        System.out.println("Moi ban nhap chieu dai cua hinh chu nhat: ");
        w = scanner.nextDouble();
        S = w * h;
        P = (w+h) * 2;
        System.out.println("Chu vi cua hinh chu nhat la: " + P);
        System.out.println("Dien tich cua hinh chu nhat la: " + S);
    }
}
