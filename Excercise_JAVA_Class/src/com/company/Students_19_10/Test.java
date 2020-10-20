package com.company.Students_19_10;

public class Test {
    public static void main(String[] args) {
        Class c1;
        try {
             c1 = new Class((short) 1, "T2004M", "active");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println("The class is changed to default");
            c1 = new Class((short) 0, "Default", "finished");
        }
        Students s1 = new Students(100, "ABC", 2.6, c1);
        System.out.println(c1);
        System.out.println(s1);
    }
}
