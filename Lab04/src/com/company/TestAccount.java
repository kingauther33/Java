package com.company;

public class TestAccount {
    public static void main(String[] args) {
        Account ac1 = new Account("1", "An", 20000);
        Account ac2 = new Account("2", "Toan", 10000);
        ac1.transferTo(ac2, 5000);
        System.out.println(ac1.toString());
        System.out.println(ac2.toString());
    }
}
