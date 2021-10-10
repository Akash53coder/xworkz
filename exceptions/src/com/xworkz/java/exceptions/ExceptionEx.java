package com.xworkz.java.exceptions;

public class ExceptionEx {

	public static void doMoreStuff() {

		try {
			System.out.println(1/0);
		}catch(ArithmeticException e) {
			System.out.println("divide by zero error");
		}
		System.out.println("next part of the program");
	}
	public static void doStuff() {
		ExceptionEx.doMoreStuff();
	}

	public static void main(String[] args) {
		ExceptionEx.doStuff();

	}

}
