package com.xworkz.inheritance.wheel.parent;

//implicit inheritance - Object
//higher level classes can be public or default cannot be private or protected
//but inner classes can have any access specifier 
public class Tyre {
	
	protected int warranty=9;
	public boolean tubeLess=false;
	private int pressure=1;
	double price;
	

	// constructor can be private, protected, public or default
	// First line of constructor is constructor-chaining either this() or super()
	// we can make a call to construtor using new or this() or super()
	// If I want to allow to access my constructor only through inheritance I can
	// restrict it by
	// -protected (only child can access which is present in different package

	// a class with protected access specifier- we can access members and construtor
	// but
	// I cannot create Instance of it
//	public Tyre() {
//
//	}
	
	public Tyre() {
		
	}

}
