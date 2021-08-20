package com.xworkz.java.instance_of.biriyani;

public class BiriyaniDemo {
	
	public static void main(String args[]) {
		
		VegBiriyani veg = new VegBiriyani();
		NonVegBiriyani nonveg = new NonVegBiriyani();
		
		Check check = new Check();
		check.checkPiece(veg);
		check.checkPiece(nonveg);
		
	}

}
