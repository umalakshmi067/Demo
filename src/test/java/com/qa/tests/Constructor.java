package com.qa.tests;

public class Constructor {

	String name;
	String no;

	public void show() {
		System.out.println("My name is");	
		
	}
	public void show1() {
		System.out.println("My name");	
		
	}

	public Constructor(int i){
	
		System.out.println("Parameter Constructor" +i);
		
	}

	
	public Constructor(){
		
		this(200);
		System.out.println("Default Constructor");
		
	}
	Constructor(String name, String no) {
		this();
//		this.name = name;
//		this.no = no;
		System.out.println(name + "\n" + no);
		this.show();
		this.show1();
		

	}

	public static void main(String[] args) {
		
		
		Constructor obj = new Constructor("vijay", "738373");
		Constructor obj1 = new Constructor("VJ", "7394329");
//		obj.show();
//		obj.show1();
//		
		
		

//		obj.name = "Vijay";
//		obj.no = "76388";

//		Constructor obj1 = new Constructor("vijay", "738373");

	}
	

}
