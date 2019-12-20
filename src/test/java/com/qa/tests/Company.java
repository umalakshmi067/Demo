package com.qa.tests;

public class Company extends OverridingA {

	public void ebay() {
		System.out.println("company");
	}

	public void amazon() {
		System.out.println("amazon company");
	}

	public static void main(String[] args) {

		OverridingA overcom = new Company();
		overcom.ebay();
		overcom.ebay1();
		

		System.out.println("*************Static Poly****************");

		Company com = new Company();
		com.ebay();
		com.ebay1();
		com.amazon();

		
		OverridingA parentobj = new OverridingA();
		
	}

}
