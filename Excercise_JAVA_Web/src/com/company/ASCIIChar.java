package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.logging.SimpleFormatter;

public class ASCIIChar {
    public static void main(String[] args) {
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        int chr = 'Z';
        System.out.println("Dog abc xyz: " + 'Z');
        System.out.printf("System.iioawf: %tc%n", System.currentTimeMillis());
        System.out.println();
    }
}