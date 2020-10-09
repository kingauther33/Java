package com.company;

public class Ss6_Ex3 {
    int width;
    int height;

    Ss6_Ex3 () {
        System.out.println("Constructor invoked...");
        width = 10;
        height = 10;
    }

    Ss6_Ex3 (int wid, int heig) {
        System.out.println("Parameterized Contructor Invoked...");
        width = wid;
        height = heig;
    }

    void displayDimensions() {
        System.out.println("Width" + width);
        System.out.println("Height" + height);
    }
    public static void main(String[] args) {
	// write your code here
        Ss6_Ex3 rec1 = new Ss6_Ex3(12,22);
        rec1.displayDimensions();
    }
}
