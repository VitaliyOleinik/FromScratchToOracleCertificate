package com;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hooooray";
        //    Hello WorldHooooray -> trim ->Hello WorldURA     -> Worl
        String s3 = s1.concat(s2).trim().replace("Hooooray", "URA").substring(6, 10);
        System.out.println(s3);
        //      Hello World -> World
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
