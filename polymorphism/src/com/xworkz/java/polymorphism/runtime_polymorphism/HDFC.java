package com.xworkz.java.polymorphism.runtime_polymorphism;

public class HDFC extends RBI{

	public static final float RATE_OF_INTEREST=15.5f;
	
	@Override
	public void dispayRateOfInterest()
	{
		System.out.println(RATE_OF_INTEREST);
	}
}
