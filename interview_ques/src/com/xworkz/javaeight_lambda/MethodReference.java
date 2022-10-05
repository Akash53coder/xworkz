package com.xworkz.javaeight_lambda;

import java.util.ArrayList;
import java.util.List;

class Emp{
	String name;
	String country;
	
	Emp(String name, String country){
		this.name = name;
		this.country = country;
	}
	
	public static int employeeSort(Emp e1, Emp e2) {
		return e1.country.compareTo(e2.country);
	}
	
	@Override
	public String toString() {
		return name+":"+country;
	}
}
public class MethodReference {

	public static void main(String[] args) {
		
		List<Emp> list = new ArrayList<>();
		list.add(new Emp("akash","usa"));
		list.add(new Emp("adarsh","india"));
		//list.sort((e1,e2) -> Emp.employeeSort(e1, e2));
		
		//method reference 
		list.sort(Emp::employeeSort);
		
		System.out.println(list);
		
		
		
//MethodType	                 |       Lambda Expression	             | Method Reference
//-------------------------------|---------------------------------------|----------------------
//Static method	                 | (String s) -> Integer.parseInt(s)	 | Integer::parseInt
//Instance method of a particular| (String s) -> s.length()	             | String::length
//-type							 |										 |
//Instance method of a particular| () -> emp.getEmpId()					 |  emp::getEmpId
//-type							 | [here emp is an instance of Employee] |
//Constructor	                 |  (String s)->new String(s)	         |  String::new	

		
	}
}
