package com.xworkz.exception;

import java.io.IOException;

//This is a tricky question, there is no problem with the code and it will compile successfully. 
//We can always catch an Exception or any unchecked exception even if it’s not in the throws clause of the method.

//Similarly, if a method (foo) declares an unchecked exception in the throws clause, it is not 
//mandatory to handle that in the program.
public class TestException {

	public static void main(String[] args) {
		try {
			bar();
		}
		catch(NumberFormatException e) {
			//any unchecked exception is fine
		}
		//error
//		catch (IOException e) {
//			e.printStackTrace();
//		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		foo();
	}

	public static void bar(){
		
	}
	
	public static void foo() throws NullPointerException{
		
	}
}

