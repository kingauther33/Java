package com.company.Students_19_10;

public class Students {
    private int rollNo;
    private String name;
    private double gpa;
    private Class classRoom;

    public Students(int rollNo, String name, double gpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.gpa = gpa;
        this.classRoom.setClassID((short) 5);
        this.classRoom.setClassName("Ms.Thi's");
        this.classRoom.setStatus("active");
    }

    public Students(int rollNo, String name, double gpa, Class classRoom) {
        this.rollNo = rollNo;
        this.name = name;
        this.gpa = gpa;
        this.classRoom = classRoom;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Class getClassRoom() {
        return classRoom;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setClassRoom(Class classRoom) {
        this.classRoom = classRoom;
    }

    public void changeClass(Class c1) {
        this.classRoom = c1;
    }

    public void changeClassDetails(short classID, String className, String status) {
        this.classRoom.setClassID(classID);
        this.classRoom.setClassName(className);
        this.classRoom.setStatus(status);
    }

    public String toString() {
        return String.format("Students[RollNo=%d,Name=%s,GPA=%.2f,%s", rollNo, name, gpa, classRoom);
    }
}
