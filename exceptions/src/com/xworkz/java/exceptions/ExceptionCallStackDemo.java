package com.xworkz.java.exceptions;

public class ExceptionCallStackDemo {
	
	static int divide(int a,int b){
		
		return a/b;
	}
	
	static int  computeDevision(int a,int b) {
		return divide(a,b);
		
	}

	public static void main(String[] args) {

		
		
			try {
				System.out.println(computeDevision(10,0));

			}catch(ArithmeticException e) {
				System.out.println("divide by zero");
			}
			
			System.out.println("next part of the program");
	}

}
