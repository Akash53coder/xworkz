package com.xworkz.java.polymorphism.runtime_polymorphism;

public class CarDemo {

	public static void main(String[] args) {

		Car c = new Car();
		c.driving();
		
		Lamborghini lam = new Lamborghini();
		lam.driving();
		
		Car cl = new Lamborghini();
		cl.driving();
		
		Car c1 = new Car();
		c1.speed(10);
		
		Lamborghini lam1 = new Lamborghini();
		lam1.speed(10.0f);
		lam1.speed(10);
		
		Car cl1 = new Lamborghini();
		cl1.speed(10);
	}

}
