package com;

public class Test1 {
    public static void main(String[] args) {

        String s1 = new String("abcdefgabc");

        String s10 = s1.substring(3);
        String s11 = s1.substring(3, 7); // defg without 'a' = 7
        System.out.println(s10 + "    " + s11);

        String s13 = s1.substring(3, 10); // end = 9, but index = 10
        System.out.println(s13);

        String s2 = new String("     asdasasd   asdas dsadasd   ");

        String s12 = s2.trim();
        System.out.println(s12);

        String s3 = "privet";
        String s14 = s3.replace('r', 'Z');
        String s15 = s3.replace("vet", "vivka");
        System.out.println(s14 + "    " + s15);

        String s4 = "poka";
        String s5 = s4.replace('k', 'k'); // char, char
        System.out.println(s4 == s5); // work with only chars // if object does not change, then its refs are equal

        String s6  = "privet";
        String s7 = " ,drug";
        System.out.println(s6.concat(s7));



    }
}
