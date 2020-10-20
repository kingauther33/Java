package com.company.Eg3;

public class TestPerson {
    public static void main(String[] args) {
        Students s1 = new Students("An", "100 Hang Da");
        s1.addCourseGrade("BNWG", 90);
        s1.addCourseGrade("BTJS", 60);
        s1.printGrade();
        System.out.println("Avaerage is: " + s1.getAverageGrade());

        Teacher t1 = new Teacher("Ms. Thi", "100 Hang Muoi");
        System.out.println(t1);
        String[] courses = {"BNWG", "BKEK", "WOER"};
        for (String course:courses) {
            if (t1.addCourse(course)) {
                System.out.println(course + " added");
            } else {
                System.out.println(course + " cannot be added");
            }
        }

        for (String course:courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " removed");
            } else {
                System.out.println(course + " cannot be removed");
            }
        }
    }
}
