package com.company;

import java.util.EnumMap;

class Main {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {

        // Creating an EnumMap of the Size enum
        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);
        sizes.put(Size.SMALL, 28);
        sizes.put(Size.MEDIUM, 32);
        sizes.put(Size.LARGE, 36);
        sizes.put(Size.EXTRALARGE, 40);
        System.out.println("EnumMap: " + sizes);

        // Using the entrySet() Method
        System.out.println("Key/Value mappings: " + sizes.entrySet());
          /*Key/Value Mapping= Anahtar/Değer Eşlemeleri*/
        // Using the keySet() Method
        System.out.println("Keys: " + sizes.keySet());
         /*Keys=Tuşlar,Anahtar*/
        // Using the values() Method
        System.out.println("Values: " + sizes.values());
        /*Values=Değerler*/
    }
}