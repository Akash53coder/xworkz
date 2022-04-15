package com.xworkz.java;

class Printer {
	static {
		System.out.println("Static block in Printer class");
	}

	public static void display(String message) {
		System.out.println(message);
	}
}

public class Tester {
	public static int sampleVariable = 1;

	static {
		System.out.println("Static block in Tester class");
	}

	public static void main(String[] args) {
//		sampleVariable++; //as I m accessing the static variable static block of Tester is called
		Printer p = null;
//		Printer p = new Printer(); //see output
		System.out.println("In main");
		p.display("The value of sample variable is: " + sampleVariable);
	}
}
//
//Static block in Tester class
//In main
//Static block in Printer class
//The value of sample variable is: 2

//
//Static block in Tester class
//Static block in Printer class
//In main
//The value of sample variable is: 2
