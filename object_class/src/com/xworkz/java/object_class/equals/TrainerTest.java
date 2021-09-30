package com.xworkz.java.object_class.equals;

public class TrainerTest {

	public static void main(String[] args) {

		Trainer asha = new Trainer("Asha","femal",6);
		Trainer asha1 = new Trainer("Asha","femal",6);
		
		Trainer omkar = new Trainer("Omkar","male",6);
		
		// when i pass the trainer object to equals method, then it will be converted 
		// to Object class refernce (upcast)
		System.out.println(asha.equals(omkar));//false
		System.out.println(asha.equals(asha1));//true internally equals method of object
		//class is having == implementation in it so we will override the object class equals
		//method
		System.out.println(asha==asha1);//false == compares address
	}

}
