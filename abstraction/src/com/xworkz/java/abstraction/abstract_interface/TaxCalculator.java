package com.xworkz.java.abstraction.abstract_interface;

public class TaxCalculator implements CentralTax,StateTax{

	public void propertyTax() {
		System.out.println("central tax");
		
	}
	
	public void roadTax() {
		System.out.println("state tax");

	}
	
}
