package com.xworkz.java.custom_exception.custom_checked_exception;

public class AtmDemo {

	public static void main(String[] args) {
		
		Atm atm = new Atm();
		try {
			atm.withdrawAmount("250bn");
		} catch (AmountMoreThanLimitException e) {
			System.out.println("Oops! Insufficient Balance");
		}
	}

}
