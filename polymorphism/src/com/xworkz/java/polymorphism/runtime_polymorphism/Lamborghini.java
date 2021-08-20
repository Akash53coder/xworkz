package com.xworkz.java.polymorphism.runtime_polymorphism;

public class Lamborghini extends Car{

	@Override
	public void driving() {
		System.out.println("lamborghini have smooth driving");
	}
	
	//tried overloading here lamborghini class already have speed method
	public void speed(float speed) {
		System.out.println("lamborghini cars speed"+speed);
	}
}
