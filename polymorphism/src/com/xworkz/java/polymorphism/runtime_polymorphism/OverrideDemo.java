package com.xworkz.java.polymorphism.runtime_polymorphism;

public class OverrideDemo {
	public static void main(String args[]) {
		
		RBI rbi = new RBI();
		rbi.dispayRateOfInterest();
		
		HDFC hdfc = new HDFC();
		hdfc.dispayRateOfInterest();
		
		ICICI icici = new ICICI();
		icici.dispayRateOfInterest();
		
		RBI rb = new HDFC();
		rb.dispayRateOfInterest();
	}

}
