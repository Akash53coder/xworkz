package com.xworkz.java;

public class Excption1 {

	public static void main(String[] args) {
		System.out.println(10/0);
		try {
			m1();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e) {
			System.out.println("Arithmetic Exception");
			//you can add try-catch again in cath if exception rised in catch block
		}
		
		System.out.println("akash");
		
	}
	
	public static void m1() {
		m2();
	}
	
	public static void m2() {
		System.out.println(10/0);
	}
}
