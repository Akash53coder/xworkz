package com.xworkz.objectdemo;

import java.lang.reflect.Method;

public class AllObjectMethods {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.Object");
		//Methods[] present in java.lang.reflect package
		Method[] met = c.getDeclaredMethods();
		System.out.println(met.length);
		for(Method m : met) {
			System.out.println(m);
		}
	}
}

// registerNatives() - is private used by Object class
//Finalize is protected (return type is Object) and  clone is protected return type is void
//12
//finalize
//wait
//wait
//wait
//equals
//toString
//hashCode
//getClass
//clone
//notify
//notifyAll
//registerNatives