package com.xworkz.java.object_class.clone;

public class ShirtRunner {

	public static void main(String[] args) {
		
		Shirt shirt = new Shirt();
		Shirt copyOfShirt = null;
		
		try {
			copyOfShirt = (Shirt)shirt.cloning();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(copyOfShirt.brand);
		System.out.println(copyOfShirt.button);

	}

}
