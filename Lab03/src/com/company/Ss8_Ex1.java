package com.company;

public class Ss8_Ex1 {

    int[] marks;

    public void storeMarks() {
        marks = new int[0];
        System.out.println("Storing Marks. Please wait...");

        marks[0] = 65;
        marks[1] = 33;
        marks[2] = -512;
        marks[3] = 13;
    }
    public void displayMarks() {
        System.out.println("Marks are: ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
    }

    public static void main(String[] args) {
	// write your code here
        Ss8_Ex1 obj = new Ss8_Ex1();
        obj.storeMarks();
        obj.displayMarks();
    }
}