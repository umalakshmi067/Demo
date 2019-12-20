package com.qa.tests;

public class finaltest {

	int empno; // data member
	String empname;

	public finaltest() {
		System.out.println("defual constructor");
	}

	public finaltest(int empno, String empname) {
		this(200);

		System.out.println(empno + "" + empname);
this.empno=empno;
this.empname=empname;

	}
	public finaltest(int x) {
		this();
		System.out.println(x);
	}

	public void display() {

		System.out.println(empno + "\t" + empname);

	}

//formal parameter which going passed in method
	public void show(String empdep) {

		System.out.println("Employee departement is" + empdep);
	}

	public static void main(String[] args) {

		finaltest obj = new finaltest(100, "Robert");

//finaltest obj1=new finaltest(200);
//const with parameter
//its used to init the data member
		obj.display();
		obj.show("Software");

	}

}
