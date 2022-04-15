package com.xworkz.java;
//reflect is a sub-package
import java.lang.reflect.Method;

public class ObjClass {
	
	public static void main(String[] args)  throws ClassNotFoundException{
		//-------------to get all the methods of Object class

		Class c = Class.forName("java.lang.Object");
		Method m[] = c.getDeclaredMethods();
		for(Method met: m) {
			//System.out.println(met.getClass());//prints the whole class
			//System.out.println(met.getClass().getSimpleName());//prints Method
			System.out.println(met.getName());//prints method names
			
		////-------------
			
		//implementation of toString() of Object
		//return getClass().getName()+"@"+Integer.toHexString(hashCode()); 
		}
		
	}
}
