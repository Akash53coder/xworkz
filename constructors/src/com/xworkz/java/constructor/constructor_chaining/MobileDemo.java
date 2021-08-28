package com.xworkz.java.constructor.constructor_chaining;

public class MobileDemo {

	public static void main(String[] args) {

		Mobile mobile = new Mobile();
		System.out.println(mobile.brand);
		
		Mobile sony = new Mobile("sony");
		System.out.println(sony.brand);
	}

}
