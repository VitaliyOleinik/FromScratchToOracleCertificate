package com;

import java.util.Locale;

public class Test6 {
    public static void main(String[] args) {
        String s = "PrIvEt";
        String s2 = s.toLowerCase();
        System.out.println(s2);
        String s3 = s.toUpperCase();
        System.out.println(s3);

        boolean b = s.contains(":2");
        boolean b1 = s.contains("t:2");
        System.out.println(b + "    " + b1);
    }
}
