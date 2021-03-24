package com;

public class Test10 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "privet".trim();
        String z = " privet".trim();
        System.out.println(x == y); // true
        System.out.println(x == z); // false
    }
}
