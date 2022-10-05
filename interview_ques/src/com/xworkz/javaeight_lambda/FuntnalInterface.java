package com.xworkz.javaeight_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface Myinter{
	public void add();
	//public void sub();// error, we should not add any other abstract other than one
	//but we can have static and default methods
	public static void sub() {
		System.out.println();
	}
	//and default method as well
	//default method has to be included with default key word
	public default void mul() {
		
	}
}
public class FuntnalInterface {

	public static void main(String[] args) {
		
		//how does compiler responsible for inferring its type:
		
		//List empList = new ArrayList();
		
		//Collections.sort(empList , (employee1, employee2) -> 
		//employee1.getCountry().compareTo(employee2.getCountry()));
		
		//The compiler will be able to refer to the above lambda expression based on the following:
		
		//Based on the current context, the compiler infers, the second parameter should be of type java.util.Comparator Interface. 
		//This inference has happened based on the definition of Collections.sort() method.
		
		//java.util.Comparator has exactly one abstract method compare() and can be used as the second parameter of sort().
		
		//The argument list of lambda expression (employee1, employee2) matches the compare(Object objt1, Object objt2) method present in 
		//the Comparator interface.
		
		//The return type of lambda's body is int, which exactly matches the compare() method's return type.
		
		//The body of the lambda here throws no checked exception, and hence matches compare() method's complete signature.

	}
}
