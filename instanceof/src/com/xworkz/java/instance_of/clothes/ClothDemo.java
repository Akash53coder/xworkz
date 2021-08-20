package com.xworkz.java.instance_of.clothes;

public class ClothDemo {
	public static void main(String args[]) {
		Softness soft = new Softness();
		
		Silk silk = new Silk();
		Cotton cotton = new Cotton();
		
		soft.isSoft(cotton);
		soft.isSoft(silk);
	}

}
