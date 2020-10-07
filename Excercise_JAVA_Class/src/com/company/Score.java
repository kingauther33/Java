package com.company;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int math, science, english, total, percent;
        int math1, science1, english1, total1, percent1;
        String check;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of An");
        System.out.println("Enter marks obtained in Maths:");
        math = sc.nextInt();
        System.out.println("Enter marks obtained in Science:");
        science = sc.nextInt();
        System.out.println("Enter marks obtained in English:");
        english = sc.nextInt();
        total = math + science + english;
        percent = total / 3;

        System.out.println();
        System.out.println("Enter marks of Toan");
        System.out.println("Enter marks obtained in Maths:");
        math1 = sc.nextInt();
        System.out.println("Enter marks obtained in Science:");
        science1 = sc.nextInt();
        System.out.println("Enter marks obtained in English:");
        english1 = sc.nextInt();
        total1 = math1 + science1 + english1;
        percent1 = total1 / 3;

        System.out.println();
        System.out.println("Marks of An:");
        System.out.printf("Maths: %d\n", math);
        System.out.printf("Science: %d\n", science);
        System.out.printf("English: %d\n\n", english);

        System.out.println();
        System.out.println("Marks of Toan:");
        System.out.printf("Maths: %d\n", math1);
        System.out.printf("Science: %d\n", science1);
        System.out.printf("English: %d\n\n", english1);

        System.out.printf("Total marks scored by An = %d\n", total);
        System.out.printf("Percentage = %d%%\n\n", percent);

        System.out.printf("Total marks scored by Toan = %d\n", total1);
        System.out.printf("Percentage = %d%%\n\n", percent1);

        check = (percent < percent1) ? "Yes" : "No";
        System.out.printf("Is An's percentage lesser than Toan's? %s\n", check);
        check = (percent > percent1) ? "Yes" : "No";
        System.out.printf("Is An's percentage greater than Toan's? %s\n", check);
        check = (percent == percent1) ? "Yes" : "No";
        System.out.printf("Is An's percentage equal to Toan's? %s\n\n", check);

        System.out.print("Scholarship amount for An = $");
        System.out.println(percent > 75 ? 20000 : percent >= 60 ? 10000 : 0);
        System.out.print("Scholarship amount for Toan = $");
        System.out.println(percent1 > 75 ? 20000 : percent1 >= 60 ? 10000 : 0);
    }
}
