package com.java.xworkz.finalvariable;

public class Student {
 
	final int NUMBER=100;
	
	void boys() {
		int b=NUMBER;
		int boys=b-40;
		System.out.println("No of Boys"+boys);
	}
	
	void girls() {
		int g=NUMBER;
		int girls=g-60;
		System.out.println("No of Girls"+girls);
	}
}
