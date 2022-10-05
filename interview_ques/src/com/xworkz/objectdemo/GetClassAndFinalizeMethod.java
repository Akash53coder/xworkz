package com.xworkz.objectdemo;

public class GetClassAndFinalizeMethod {

	public static void main(String[] args) {
		String s = new String("a");
		System.out.println(s.getClass().getSimpleName());//String
		System.out.println(s.getClass().getName());//java.lang.String
		System.out.println(s.getClass());//class java.lang.String
		
		//finalize method
		//Finalize method in Java is an Object Class method that is used to perform 
		//cleanup activity before destroying any object. 
		//It is called by Garbage collector before destroying the object from memory. 
		//Finalize() method is called by default for every object before its deletion.
		
		 //Clean-up activity means closing the resources associated with that object like 
		//Database Connection, Network Connection, or we can say resource de-allocation. 
		//Remember, it is not a reserved keyword. Once the finalize() method completes 
		//immediately, Garbage Collector destroys that object. 
	}
}
