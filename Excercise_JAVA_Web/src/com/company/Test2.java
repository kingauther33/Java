package com.company;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
	// Parameter + Area of Circle
        Scanner scanner = new Scanner(System.in);
        double r, S, P;
        System.out.println("Moi ban nhap ban kinh cua hinh tron: ");
        r = scanner.nextDouble();
        System.out.println("Chu vi cua hinh tron la: " + 2*r*Math.PI);
        System.out.println("Dien tich cua hinh tron la: " + r*r*Math.PI);
    }
}
