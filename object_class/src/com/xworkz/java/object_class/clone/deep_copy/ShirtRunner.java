package com.xworkz.java.object_class.clone.deep_copy;

public class ShirtRunner {

	public static void main(String[] args) {

		Shirt shirt = new Shirt();
		Shirt copyOfShirt = null;
		
		try {
			copyOfShirt=shirt.cloning();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("clone not supported for this object"+e);
		}
		
		System.out.println(shirt.brand);
		System.out.println(shirt.button.type);
		
		System.out.println(copyOfShirt.brand);
		System.out.println(copyOfShirt.button.type);
	}

}
