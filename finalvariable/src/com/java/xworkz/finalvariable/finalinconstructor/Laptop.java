package com.java.xworkz.finalvariable.finalinconstructor;

public class Laptop {

	final String BRAND;
	final String COLOR;
	final String DISPLAY;
	final int QUANTITY;
	
	Laptop(){
		BRAND="Mac";
		COLOR="silver";
		DISPLAY="13In";
		QUANTITY=12;
	}
	
	Laptop(double price){
		BRAND="Dell";
		COLOR="silver";
		DISPLAY="14In";
		QUANTITY=13;
	}
	Laptop(double price, double range){
		BRAND="HP";
		COLOR="silver";
		DISPLAY="14In";
		QUANTITY=13;
	}
	
	void display() {
	
		System.out.println("Laptop [BRAND=" + BRAND + ", COLOR=" + COLOR + ", DISPLAY=" + DISPLAY + ", QUANTITY=" + QUANTITY + "]");
	}


	
}
