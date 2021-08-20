package com.xworkz.java.instance_of.biriyani;

public class Check {
	
	public void checkPiece(Biriyani biriyani) {
		
		if(biriyani instanceof VegBiriyani) {
			System.out.println("I got veg biriyani");
		}else {
			System.out.println("I got chicken biriyani");
		}
	}

}
