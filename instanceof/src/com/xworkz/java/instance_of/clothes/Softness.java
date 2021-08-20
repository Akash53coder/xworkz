package com.xworkz.java.instance_of.clothes;

public class Softness {
	
	public void isSoft(Cloth cloth) {
		if(cloth instanceof Silk) {
			System.out.println("it is a silk cloth");
		}else {
			System.out.println("it is a cotton cloth");
		}
	}

}
