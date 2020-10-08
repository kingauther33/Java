package com.company;

import java.util.Scanner;

public class Ss5_Try2 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String tieptuc;
        int congviec;
        do {
            System.out.println("Menu cong viec:");
            System.out.println("1. Pha ca phe");
            System.out.println("2. Pha nuoc che");
            System.out.println("3. Pha tra chanh");
            System.out.print("Moi ban chon cong viec muon thuc hien: ");
            congviec = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (congviec) {
                case 1:
                    System.out.println("Ban vua pha mot coc ca phe thom ngon :D");
                    System.out.print("Ban co muon thuc hien cong viec khac ko? (Yes/No)? ");
                    tieptuc = sc.nextLine();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ban vua pha mot coc nuoc che tuyet dinh :D");
                    System.out.print("Ban co muon thuc hien cong viec khac ko? (Yes/No)? ");
                    tieptuc = sc.nextLine();
                    System.out.println();

                    break;
                case 3:
                    System.out.println("Ban vua pha mot coc nuoc chanh tuoi mat :D");
                    System.out.print("Ban co muon thuc hien cong viec khac ko?  (Yes/No)? ");
                    tieptuc = sc.nextLine();
                    System.out.println();
                    break;
                default:
                    System.out.print("Ban da khong chon cong viec nao ca, ban co muon chon lai ko? (Yes/No)? ");
                    tieptuc = sc.nextLine();
                    System.out.println();
            }
            System.out.println("=========================================");
        } while (tieptuc.equalsIgnoreCase("Yes"));
    }
}
