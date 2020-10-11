package com.company;

import java.util.*;

public class Ss8_Ex3 {

    ArrayList marks = new ArrayList();

    public void storeMarks() {
        System.out.println("Storing marks. Please wait...");
        marks.add(100);
        marks.add(20);
        marks.add(40);
        marks.add(23);
        marks.add(100);
    }

    public void displayMarks() {
        System.out.println("Marks are: ");
        System.out.println("Iterating ArrayList using FOR loop: ");
        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }
        System.out.println("-----------------------------------------");
        Iterator imarks = marks.iterator();
        System.out.println("Iterating ArrayList using Iterator: ");
        while (imarks.hasNext()) {
            System.out.println(imarks.next());
        }
        System.out.println("-----------------------------------------");

        Collections.sort(marks);
        System.out.println("Sorted lists is: " + marks);
    }

    public static void main(String[] args) {
	// write your code here
        Ss8_Ex3 obj = new Ss8_Ex3();
        obj.storeMarks();
        obj.displayMarks();
    }
}