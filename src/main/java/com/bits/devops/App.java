package com.bits.devops;

/**
 * DevOps Lab - Continuous Build and Continuous Integration
 * Name    : Arjun Gupta
 * BITS ID : 2022WA86307
 */
public class App {

    public static String getMessage() {
        return "DevOps Lab - Continuous Build using Maven. Version 1.0";
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println(" BITS ID : 2022WA86307");
        System.out.println(" Name    : Arjun Gupta");
        System.out.println("-----------------------------------------");
        System.out.println(" " + getMessage());
        System.out.println(" Sample computation 5 + 7 = " + add(5, 7));
        System.out.println("=========================================");
    }
}
