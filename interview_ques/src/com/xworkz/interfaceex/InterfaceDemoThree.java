package com.xworkz.interfaceex;


interface InterfaceOne{
	int a = 1;
	default void m1() {
		System.out.println("m1 in interface executed");
	}
}

class Dummy implements InterfaceOne{
	//if i try to override a default method in interface
	//I need to change the visibility to public
	public void m1() {
		System.out.println("m1 in Dummy executed");
	}
}

public class InterfaceDemoThree {
	public static void main(String[] args) {
		Dummy dum = new Dummy();
		dum.m1();
		
		InterfaceOne i = new Dummy();
		i.m1();
	}
}

//read functional interface
//marker interface
//when to use what ?
//https://www.baeldung.com/java-interface-vs-abstract-class