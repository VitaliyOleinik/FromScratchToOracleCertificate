package com;

public class Main {

    public static void main(String[] args) {
	    String s1 = new String("Hello");
        String s2 = new String("Hello");
        boolean checkForAddress = (s1 == s2)?true:false;
        System.out.println(checkForAddress);
        String s3 = "poka";
        String s4 = "poka";
        String s5 = "poka"; // all address wil be equal s3 = s4 = s5

        String s10 = new String("ok");
        System.out.println("ok" == s10);

    }
}
