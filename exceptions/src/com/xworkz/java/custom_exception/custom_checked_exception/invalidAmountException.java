package com.xworkz.java.custom_exception.custom_checked_exception;

public class invalidAmountException extends NumberFormatException{

	@Override
	public String toString() {
		
		return "Oops! Invalid Amount";
	}
}
