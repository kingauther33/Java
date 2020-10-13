package com.company;

public class Ss6_Try01_1210 {
    String studName;
    static int studAge;

    void initialize() {
        studName = "Toan";
        studAge = 30;
    }

    void display() {
        System.out.println("Student name is: " + studName);
        System.out.println("Student age is: " + studAge);
        studAge += 30;
    }

    public static void main(String[] args) {
        Ss6_Try01_1210 obj;
        obj = new Ss6_Try01_1210();
        obj.initialize();
        obj.display();
    }
}
