package com.xworkz.polymorphism;

//POLYMORPHISM - the ability of an object to take many forms

//example - rate of interest in banks compared to RBI.

//static poly-morphism - compiler time or early binding (method resolution happens 
//during compile time
//ex. overloading - talks about method signature where having same method name, but different in 
//number of parameters and type of parameters and order of parameters.

//return type doen't matter here

//runtime poly-morphism - runtime or late binding  (method resolution happens during run time
//based on run time object.
//When we override a method in the child class, it should have the same 
//signature and return type parent class.
//a overridden method in sub class must have access specifier which is more visible
//private methods cannot be overridden 

//return type considered here static methods can be overloaded, but not overridden


//overloading and overriding

//overloading happens in a same class
//overriding happens in super class and child class

class Sup{
	
	public void m1() {
		
		System.out.println("m1 of parent");
	}
	
}
public class PolyMorphDemo extends Sup{
	
	@Override
	public void m1() {
		System.out.println("m1 of child");
	}
	
	public void m2() {
		System.out.println("m2 method of child");
	}
	
	public static void main(String[] args) {
		Sup sup = new PolyMorphDemo();
		sup.m1();
		
		Sup sup1 = new Sup();
		sup1.m1();
		
		PolyMorphDemo p = new PolyMorphDemo();
		p.m1();
		
		PolyMorphDemo p1 = (PolyMorphDemo) new Sup();
		p1.m1();
		
		
		
	}
	
}
