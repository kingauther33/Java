package com.company.Ex7;

public class Customer {
    private int ID;
    private String name;
    private int discount;
    
    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return String.format("Name(%d)", this.ID);
    }
}