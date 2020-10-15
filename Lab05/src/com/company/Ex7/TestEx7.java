package com.company.Ex7;

public class TestEx7 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "An", 3000);
        Invoice i1 = new Invoice(1, c1, 100000);

        System.out.println(c1);
        System.out.println(i1);
    }
}
