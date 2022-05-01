package com.xworkz.java;

//the purpose of clonning is to have a backup of object
//and to preserve the state of an object
//protected native Object clone() throws CloneNotSupportedException 
//we can only clone Clonable objects(objects of a class implementing Cloneable ), 
//otherwise we wil get CloneNotSupportedException

//Clonable interface is a marker interface, where it doesn't have any method declarations
//Clonable is present in java.lang pakage
//Object class clone method is meant for shallow clonning so we will override it 
//the process of creating bitwise copy of an object is called, shallow cloning 

//if the main object contain primitive variables, exactly duplicate copies will be created in the 
//clonned object, if the main object contain any reference variable, then corresponding object won't be
//created just duplicate reference variable will be created pointing to old contained object
public class ObjClone implements Cloneable {
	public int i = 10;
	public int j = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjClone o = new ObjClone();
		ObjClone o1 = (ObjClone) o.clone();
		System.out.println(o1.i);
	}
}
