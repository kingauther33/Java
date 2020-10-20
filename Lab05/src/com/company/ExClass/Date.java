package com.company.ExClass;

public class Date {
    byte day;
    byte month;
    short year;

    Date() {
        day = 0;
        month = 0;
        year = 0;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void setDate(byte day, byte month, short year) {
        this.setDay(day);
    }
}
