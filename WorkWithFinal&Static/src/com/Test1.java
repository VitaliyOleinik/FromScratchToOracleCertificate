package com;

public class Test1 {
//    public final int a;

//    Test1(){
//        a = 10;
//    }
//    Test1(boolean b){
//        a = 20;
//    }

    public final int a = 10;

    public void abc(final short s){
        final byte b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        // t.a = t.a * 2; // Compiler Error. final, not edited, non access modifier
        System.out.println(t.a);
    }
}
