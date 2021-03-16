package com;

public class MethodOverloading {
    void showInt(int i1){
        System.out.println(i1);
    }

    void showBoolean(boolean b1){
        System.out.println(b1);
    }

    void showString(String s1){
        System.out.println(s1);
    }

    void show(int i1){
        System.out.println(i1);
        System.out.println("Data Type is Int");
    }

    void show(int a, int b){
        System.out.println(a);
        System.out.println(a);
    }

    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Data Type is Boolean");
    }

    void show(String s1){
        System.out.println(s1);
        System.out.println("Data Type is String");
    }

    void show(String s, int a){
        System.out.println("String " + s);
        System.out.println("Int " + a);
    }

    void show(int a, String s){
        System.out.println("That's a nice day!");
    }
}
