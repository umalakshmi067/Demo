package com.qa.tests;

import org.testng.annotations.Test;

public class TestNG {

	@Test
	public void addition() {
		int a=10, b=20;
		System.out.println("addition" + a+b);
		
		
		
	}
	
	@Test
	public void subtraction() {
		int a=10, b=20;
		System.out.println("sub"+ b+a);
		
	}
	@Test
	public void div() {
		int a=10, b=20;
		System.out.println("div" + b/a);
		
	}
	@Test
	public void multi() {
		int a=10, b=20;
		System.out.println("multi" + a*b);
		
	}
}

