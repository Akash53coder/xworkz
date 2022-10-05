package com.xworkz.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		//we cannot instantiate abstract class
		//but we can use it's reference
		
		//A a = new B();
	}
}

abstract class A{
	
	//an abstract class may or may not contain abstract methods
	//if one of the methods in A is abstract then class must be abstract
	//concrete methods, which have body or implementation
	//abstract class can have both concrete methods and abstract methods
	//in a subclass I can override concrete methods and I must give implementation for abstract
	//methods
	
	//public abstract void m1();
	
	//If an abstract class doesn’t have any method implementation (100% abstraction), 
	//it’s always better to use interface
	
	//we can achieve abstraction by abstract class and interface
	
	
	//when to consider abstract class and interface
	
	//interface : multiple unrelated objects shows - 'HAS A' capabilities.
	//when A (normal class) is capable of doing this kind of relations.
	//ex. unrelated objects (classes) implement serializable or cloneable interface
	//want to have multiple inheritance.
	//if I want to specify behavior of a particular data type, but not concerned about 
	//who implements it's behavior.
	//considering A implements Serializable, and B implements Serializable. then A and B are not related
	
	//abstract class: related objects shows "IS-A" relation.
	//sharing the codes with closely related class.
	//if we want to use non-static or final fields. where we can define methods that can modify
	//the state of an object
	//if I require access modifiers other than public (protected or private ) then I can use Abstrct class
	//considering class  C <- (abstract class) A -> B 
	//then B and C are related through A class.
	//(Reader (abstract class) -> BufferReader and FileReader )
	//here FileReader and BufferReader are related through Reader (an Abstract class)
	//have common code related to all it's sub classes.

	
	public void m2() {
		System.out.println("m2 method");
	}
}

class B extends A{

//	@Override
//	public void m1() {
//		System.out.println("m1 in subclass");
//	}
	
}