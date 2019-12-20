package com.qa.tests;

public class MainMethodOverloading {

	public static void main(int a, int b) {

		System.out.println(a + " " + b);

	}

	public static void main(String str) {
		System.out.println(str);
	}

	public static void main(String arg[]) {

		System.out.println("Selenium Scripting");
		// MainMethodOverloading man= new MainMethodOverloading();
		main("Selenium");
		main(100, 200);
		main(100);

	}

	public static void main(int a) {
		System.out.println(a);

	}

}
