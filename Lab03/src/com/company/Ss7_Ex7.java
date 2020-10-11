package com.company;

public class Ss7_Ex7 {

    int rollNo;
    String name;
    String address;
    float marks;

    public Ss7_Ex7() {
        rollNo = 0;
        name = "";
        address = "";
        marks = 0;
    }

    public Ss7_Ex7(int rNo, String sname) {
        rollNo = rNo;
        name = sname;
    }

    public Ss7_Ex7(int rNo, float score) {
        rollNo = rNo;
        marks = score;
    }

    public Ss7_Ex7(String sName, String addr) {
        name = sName;
        address = addr;
    }

    public Ss7_Ex7(int rNo, String sname, float score) {
        rollNo = rNo;
        name = sname;
        marks = score;
    }

    public void displayDetails() {
        System.out.println("Rollno: " + rollNo);
        System.out.println("Student name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Score: " + marks);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
	// write your code here
        Ss7_Ex7 obj = new Ss7_Ex7("David", "302, Washington Street");
        obj.displayDetails();

        Ss7_Ex7 obj1 = new Ss7_Ex7(103, 46);
        obj1.displayDetails();

        Ss7_Ex7 obj2 = new Ss7_Ex7(104, "Roger", 50);
        obj2.displayDetails();
    }
}