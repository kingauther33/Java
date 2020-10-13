package com.company;

import java.nio.charset.Charset;

public class CharacterSets {
    public static void main(String[] args) {
        System.out.println("Lists of character sets: ");
        for (String str : Charset.availableCharsets().keySet())
            System.out.println(str);
    }
}
