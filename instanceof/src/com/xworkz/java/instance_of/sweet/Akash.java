package com.xworkz.java.instance_of.sweet;

public class Akash {
	
	public void mouth(Sweet sweet) {
		
		if(sweet instanceof Cake) {
			System.out.println("I got cake");
		}else {
			System.out.println("I got Chocolate");
		}
	}

}
