package com;

public class Main {

	static void workWithMethodOverloading1(){
		MethodOverloading mO = new MethodOverloading();
		int a = 500;
		mO.showInt(a);
		boolean b = true;
		mO.showBoolean(b);
		String s = "Privet!!!";
		mO.showString(s);

		mO.show(a);
		mO.show(b);
		mO.show(s);
		mO.show(a, a);

		mO.show("Privet", 10);
		mO.show(10, "Hi");
	}

    public static void main(String[] args) {
	    //workWithMethodOverloading1();

	    MethodOverloading2 methodOverloading2 = new MethodOverloading2();

	    int a = methodOverloading2.sum(5, 8);
		System.out.println(a);
		String s = methodOverloading2.sum("privet,", " my friend");
		System.out.println(s);

    }
}
