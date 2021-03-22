package com;

public class Test {


    public static void main(String[] args) {
        String s1 = new String("privet");
        int a = s1.length();
        System.out.println(a);
        char c1 = s1.charAt(3);
        System.out.println(c1);

        int i1  = s1.indexOf('t');
        System.out.println(i1);
        int i2 = s1.indexOf("vet");
        System.out.println(i2);
        int i3 = s1.indexOf("z"); // if it does not exist -> index = -1
        System.out.println(i3);

        String s2 = new String("abcdefgabcd");
        int i4 = s2.indexOf("a", 5);
        System.out.println(i4);
        int i5 = s2.indexOf('b', 5);
        System.out.println(i5);

        boolean b1 = s2.startsWith("abc");
        System.out.println(b1);
        boolean b2 = s2.startsWith("abc", 7);
        System.out.println(b2);

        boolean b3 = s2.endsWith("abc"); // false
        b3 = s2.endsWith("cd"); // true
        System.out.println(b3);
    }
}
