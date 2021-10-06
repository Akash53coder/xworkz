package com.xworkz.java.exceptions;

public class ExceptionEx1 {

	public static void main(String[] args) {
		String str = "12A";
		try {
			int i = Integer.parseInt(str);
		}catch(NumberFormatException exp) {
			System.out.println("enter a valid number");
		}

	}

}
