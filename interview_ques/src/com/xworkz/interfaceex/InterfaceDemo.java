package com.xworkz.interfaceex;

public interface InterfaceDemo {

	//variables in an interfaces are by default public static final
	//and methods in an interfaces are default public and abstract
	//I can't create object of interface
	//Inheritance is possible in an interface and it supports multiple inheritance.
	
	//It is the blueprint of the class.
	
	int CAUTION_MONEY = 2000;
//    String createAccount(Customer customer);
//    double issueVehicleLoan(String vehicleType, Customer customer);
//    double issueHouseLoan(Customer customer);
//    double issueGoldLoan(Customer customer);
	
	//advantages
	//100% abstraction, loose coupling, multiple inheritance
	
	//New Features Added in Interfaces in JDK 8 from JDK 9
	
	//1. default methods with default implementation, these can be inherited
	
//	void display() {
//		System.out.println();
//	}
	// Java program to show that interfaces can
	// have methods from JDK 1.8 onwards 1.8 <
	  
//	interface In1
//	{
//	    final int a = 10;
//	    default void display()
//	    {
//	        System.out.println("hello");
//	    }
//	}
//	  
//	// A class that implements the interface.
//	class TestClass implements In1
//	{
//	    // Driver Code
//	    public static void main (String[] args)
//	    {
//	        TestClass t = new TestClass();
//	        t.display();
//	    }
//	}
	
//2. Another feature that was added in JDK 8 is that we can now define static methods in interfaces 
// that can be called independently without an object. Note: these methods are not inherited.
	
	
	// Java Program to show that interfaces can
	// have methods from JDK 1.8 onwards
	  
//	interface In1
//	{
//	    final int a = 10;
//	    static void display()
//	    {
//	        System.out.println("hello");
//	    }
//	}
//	  
//	// A class that implements the interface.
//	class TestClass implements In1
//	{
//	    // Driver Code
//	    public static void main (String[] args)
//	    {
			//must be called with interface name
//	        In1.display();
//	    }
//	}
	
	//3. interface can also have private members
	
	
	//note:
	//Implement the Serializable interface when you want to be able to convert an instance of a 
	//class into a series of bytes or when you think that a Serializable object might reference an 
	//instance of your class.
	//saving objects into files or transffering over the network in form of bytes.
	//It makes storing and sending objects easy. It has nothing to do with security.
	//java.io package
	

}
