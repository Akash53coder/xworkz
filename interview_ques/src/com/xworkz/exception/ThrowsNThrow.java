package com.xworkz.exception;

public class ThrowsNThrow {

	
	public static void main(String[] args) throws Exception  {
		int i=10;
		int j=0;
		
		if(j==0)
			throw new ArithmeticException("divide by zero");// here I have used checked exception
		//I can have throw in catch block also
//		try {
//			
//		}catch(Exception e) {
//			throw new Exception("");
//		}
		int z=i/j;
		System.out.println(z);
	}
	
}
