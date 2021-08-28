package com.java.xworkz.finalvariable.finalinblocks;

public class Cloth {
	
	final String BRAND;
	final String COLOR;
	final int PRICE;
	
	{
		BRAND="Peter England";
		COLOR="Grey";
		PRICE=1400;
	}
	

	void display() {
		System.out.println("Cloth [BRAND=" + BRAND + ", COLOR=" + COLOR + ", PRICE=" + PRICE + "]");
	}

}
