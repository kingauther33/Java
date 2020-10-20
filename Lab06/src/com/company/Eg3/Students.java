package com.company.Eg3;

public class Students extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;
    public static final int MAX_COURSES = 30;

    public Students(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }

    public void printGrade() {
        System.out.println(this);
        for (int i=0; i < numCourses; i++) {
            System.out.printf(" %s:%d", courses[i], grades[i]);
        }
        System.out.println();
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i=0; i<numCourses; i++) {
            sum += grades[i];
        }
        return  (double) sum / numCourses;
    }
}
