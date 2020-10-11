package com.company;

public class Ss7_Ex5 {

    int empID;
    String empName;
    private String SSN;
    protected  String empDesig;

    private Ss7_Ex5(int ID, String name) {
        empID = ID;
        empName = name;
    }

    private String getSSN() {
        return "SSN number is: " + SSN;
    }

    private void setSSN(String ssn) {
        SSN = ssn;
    }

    private void setDesig(String desig) {
        empDesig = desig;
    }

    private void display() {
        System.out.println("Employee ID is: " + empID);
        System.out.println("Employee Name is: " + empName);
        System.out.println("Employee SSN is: " + SSN);
        System.out.println("Employee Designation is: " + empDesig);
    }

    public static void main(String[] args) {
	// write your code here
        Ss7_Ex5 obj = new Ss7_Ex5(1100, "AnDINK");
        obj.empDesig = "Manager";
        obj.SSN = "1929319391";
        obj.display();

        obj.setSSN("4820385890123");
        obj.SSN = obj.getSSN();
        obj.setDesig("CEO");

        obj.display();
    }
}