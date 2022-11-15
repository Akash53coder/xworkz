package com.xworkz.interfaceex;

//Interface defines, how an object communicate with other objects
//These also represent IS-A relationship.

public interface InterfaceDemo {

	//variables in an interfaces are by default public static final
	//and methods in an interfaces are default public and abstract
	//I can't create object of interface
	//It supports multiple inheritance.
	
	//It is the blueprint of the class. i.e it defines the behavior of a class.
	
	//If a class implements an interface and does not provide method bodies for all 
	//functions specified in the interface, then the class must be declared abstract.
	
//	int CAUTION_MONEY = 2000;
//    String createAccount(Customer customer);
//    double issueVehicleLoan(String vehicleType, Customer customer);
//    double issueHouseLoan(Customer customer);
//    double issueGoldLoan(Customer customer);
	
	//advantages
	//100% abstraction, loose coupling, multiple inheritance
	
	//New Features Added in Interfaces in JDK 8 
	//_______________________________________________________________
	
	// * from Java 8 we have default methods and static methods as additional feature.
	// * from Java 9 we can have private methods in an interface.
	//_______________________________________________________________
	
	//1. default methods with default implementation, these can be inherited
	//default keyword is must.
	
//	default void display() {
//		System.out.println();
//	}
	
	
	// Java program to show that interfaces can have default methods from JDK 1.8 
	  
//	interface In1
//	{
//	    public int a = 10;//by default public static final
//	    default void display()
//	    {
//	        System.out.println("hello");
//	    }
//	}
	  
//	A class that implements the interface.
//	class TestClass implements In1
//	{
//	    // Driver Code
//	    public static void main (String[] args)
//	    {
//	        TestClass t = new TestClass();
//	        t.display();
//	    }
//	}
	
}
//2. Another feature that was added in JDK 8 is that we can define static methods in interfaces 
// that can be called independently without an object. Note: these methods are not inherited.
	
	
	// Java Program to show that interfaces can
	// have methods from JDK 1.8 onwards
	  
	interface In1
	{
	    final int a = 10;
	    //_______________ static method
	     static void display()
	    {
	        System.out.println("hello");
	    }
	  //_______________ private method
	     //change jdk version to >=9
//	     private static String staticPrivate() {
//	         return "static private";
//	     }
//	     
//	     private String instancePrivate() {
//	         return "instance private";
//	     }
	    
	}
//	  
	// A class that implements the interface.
	class TestClass implements In1
	{
	    // Driver Code
	    public static void main (String[] args)
	    {
//	    	TestClass t = new TestClass();
//	    	t.display(); //Error
			//must be called with interface name
	        In1.display();
	    }
	}
	
	//3. interface can also have private members
	
	
	//note:
	//Implement the Serializable interface when you want to be able to convert an instance of a 
	//class into a series of bytes or when you think that a Serializable object might reference an 
	//instance of your class.
	//saving objects into files or transferring over the network in form of bytes.
	//It makes storing and sending objects easy. It has nothing to do with security.
	//java.io package
	
