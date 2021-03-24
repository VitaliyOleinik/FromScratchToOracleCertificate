package com;

public class Test9 {
    public static void main(String[] args) {
        String s1 = new String("OK");
        String s2 = new String("OK");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2));
        String s3 = "privet";
        System.out.println(s1 != s3);

        String s4 = "Kak Ty?";
        String s5 = "kak ty?";
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
