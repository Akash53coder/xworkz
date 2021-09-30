package com.xworkz.java.custom_exception.custom_checked_exception;

public class AmountMoreThanLimitException extends Exception{

	@Override
	public String toString() {
		return "Amount entered is more than limit" ;
	}
}
