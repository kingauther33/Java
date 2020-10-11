package com.company;

public class Ss8_Ex2 {

    int [][] marks;

    public void storeMarks() {
        marks = new int[4][2];
        System.out.println("Storing Marks, Please wait....");

        marks[0][0] = 23;
        marks[0][1] = 32;
        marks[2][1] = 13;
        marks[2][0] = 43;
        marks[1][0] = 11;
        marks[1][1] = 22;
    }

    public void displayMarks() {
        System.out.println("Marks are: ");
        System.out.println("Roll no.1: " + marks[0][0] + ", " + marks[0][1]);
        System.out.println("Roll no.2: " + marks[1][0] + ", " + marks[1][1]);
        System.out.println("Roll no.3: " + marks[2][0] + ", " + marks[2][1]);
        System.out.println("Roll no.4: " + marks[3][0] + ", " + marks[3][1]);
    }

    public static void main(String[] args) {
	// write your code here
        Ss8_Ex2 obj = new Ss8_Ex2();
        obj.storeMarks();
        obj.displayMarks();
    }
}