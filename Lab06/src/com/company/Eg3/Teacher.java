package com.company.Eg3;

public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    public static final int MAX_COURSES = 30;

    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[MAX_COURSES];
    }

    @Override
    public String toString() {
        return String.format("Teacher: %s", super.toString());
    }

    public boolean addCourse(String course) {
        for (int i=0; i<numCourses; i++) {
            if (courses[i].equals(course)) {
                return false;
            };
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        boolean exists = false;
        int courseIndex = 0;
        for (int i=0; i<numCourses; i++) {
            if (courses[i].equals(course)){
                courseIndex = i;
                exists = true;
                break;
            }
        }

        if (exists) {
            for (int i = courseIndex; i < numCourses-1; i++) {
                courses[i] = courses[i+1];
            }
            numCourses--;
            return true;
        } else {
            return false;
        }
    }
}

