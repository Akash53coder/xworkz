package com.xworkz.java.custom_exception.custom_checked_exception;

public class Atm {
	
	public static final double amount=25000.00;
	
	public void withdrawAmount(String enteredAmount) throws AmountMoreThanLimitException {
		
		try {
			int amt=Integer.parseInt(enteredAmount);
			if(amt<=amount) {
				System.out.println("you can withdraw "+amt+"rs");
			}else {
				throw new AmountMoreThanLimitException();
			}
		}catch(invalidAmountException e) {
			
			System.out.println("Invalid amout entered");
		}
		
		
		
	}

}
