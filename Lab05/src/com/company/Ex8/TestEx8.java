package com.company.Ex8;

public class TestEx8 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "An", 'M');
        Account a1 = new Account(1, c1, 100000);
        Account a2 = a1.withdraw(3000);
        System.out.println(a1);
        System.out.println(a2);
        a2 = a1.withdraw(50000);
        System.out.println(a2);
    }
}
