package com.xworkz.javaeight_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//programs on lambda expression


//employees sorted based on country. (using traditional method)
class Employee{
	String name;
	String country;
	
	public Employee(String name, String country){
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", country=" + country + "]";
	}
	
	
}
//by using traditional method we need to have a Comparator class to implement 
//a Comparator interface, any changes leads to create another class that implements Comparator 
//again
class MyComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.country.compareTo(o2.country);
	}
	
}
public class ListDemo {
	
	//sort method using traditional Comparator class
	public static void sortEmployeesBasedOnCountry(List<Employee> list) {
		list.sort(new MyComp());//custom Comparator class
	}
	
	//sort method using anonymous class
	//Even for simple operations,additional syntactical code is required to be written 
	//whenever needed. And, the problem because of this bulky syntax is called a vertical problem.
	public static void sortEmployeeBasedOnCountryAnon(List<Employee> list) {
		list.sort(new Comparator<Employee>() {
			public int compare(Employee e, Employee e1) {
				return e.country.compareTo(e1.country);
			}
		});
	}
	
	//the better syntax is, using anonymous class with better syntax i.e lambda exp [java 8]
	//here lambda expression gives implementation logic for the functional interface [interfaces
	//having only one abstract methods] 
	//They also make the modifiers, return type, and parameter types completely optional.
	public static void sortEmployeeBasedOnCountryLambda(List<Employee> list) {
		//Employee is optional here 
		Comparator<Employee> comp = (Employee e1, Employee e2) ->
			e1.country.compareTo(e2.country);
		list.sort(comp);
	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("akash","usa"));
		list.add(new Employee("adarsg","uae"));
		list.add(new Employee("sihi","india"));
		
		ListDemo.sortEmployeeBasedOnCountryLambda(list);
		
		System.out.println(list);
	}
}


