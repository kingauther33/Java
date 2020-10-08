package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Ss5_Try3 {

    public static void main(String[] args) {
	// write your code here
        int soThuNhat, soThuHai, dem, dem1;
        dem = dem1 = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Moi ban nhap so thu nhat: ");
            soThuNhat = Integer.parseInt(sc.nextLine());
            System.out.print("Moi ban nhap so thu hai: ");
            soThuHai = Integer.parseInt(sc.nextLine());
            if ((soThuNhat <= 1) && (soThuHai <= 1)) {
                System.out.println("2 so ban vua nhap khong trong khoang hop le cua so nguyen to, moi nhap lai");
                System.out.println();
            }
        } while ((soThuNhat <= 1) && (soThuHai <= 1));


        if (soThuNhat >= soThuHai) {
            int temp;
            temp = soThuNhat;
            soThuNhat = soThuHai;
            soThuHai = temp;
        }

        System.out.printf("So nguyen to trong khoang tu %d den %d la: ", soThuNhat, soThuHai);
        while (soThuNhat <= soThuHai) {
            for (int i = 2; i <= Math.sqrt(soThuNhat); i++) {
                if (soThuNhat % i == 0) dem++;
            }
            if (dem == 0) {
                System.out.printf("%d ", soThuNhat);
                dem1++;
            }
            dem = 0;
            soThuNhat++;
        }
        System.out.printf("\nCo tat ca %d so nguyen to trong khoang tu %d den %d.", dem1, soThuNhat, soThuHai);
    }
}
