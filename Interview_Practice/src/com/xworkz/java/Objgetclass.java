package com.xworkz.java;

 
//for every loaded class JVM, creates a Class class object in the heap area. By using this object
//we can access class level properties like fully qualified name of the class, method information,
//constructor info, etc
//Class is present in java.lang.Class
//declaration in object class - public final Class getClass(){}
public class Objgetclass {
	public static void main(String[] args) throws ClassNotFoundException {
		String a = "akash";
		Object o = a;
		Class c = o.getClass();//returns the runtime class definition
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getDeclaredMethods());//returns array of Method
		System.out.println(c.getDeclaredConstructors());
		
	}
	
}
