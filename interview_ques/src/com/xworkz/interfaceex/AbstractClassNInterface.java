package com.xworkz.interfaceex;

public class AbstractClassNInterface {

	//abstract classes
	
	//Abstract class can have abstract and non-abstract methods. (concrete methods)
	//Abstract class doesn't support multiple inheritance.
	//Abstract class can have final, non-final, static and non-static variables.
	//no objects
	
	//interface
	//Interface can have only abstract methods. Since Java 8, 
	//it can have default and static methods also.
	
	//Interface supports multiple inheritance.
	//Interface has only static and final variables.
	//no objects
	
	//when to use what ?
	//interface
	//if the requirement is to achieve multiple-inheritance
	//if unrelated class wants implement some functionality ex. Comparable which provides compareTo method 
	//and we can override it to compare to objects
	//when the application functionality is defined as contract, 
	//and less concerned about who implements this i.e If my requirement to use third-party vendors.
	//This talks about A is capable of doing this.
	
	//abstract class
	//If we have specified requirements and only partial implementation details for specific methods
	//While classes that extend abstract classes have several common fields or methods
	//Abstract classes are used by the sub class. That are strictly a child of it.
	//if we want to achieve non-final/static variable.
	//This talks about Dog is a animal. Honda is a car. 
	//(but this condition may not holds good for interface always)
	
	//https://www.baeldung.com/java-interface-vs-abstract-class
}
