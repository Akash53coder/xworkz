package com.xworkz.java.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		//constructors
//		Vector v1 = new Vector(5);
//		Vector v1 = new Vector(5,2);(initialCapacity, incremental capacity);
//		Vector v1 = new Vector(Collection c);
		
		//as Vector is a legacy class most of the methods are of old one
//		v.addElement(Object o):void; //element added at last
//		v.copyInto(Object[] a):void;// copies an Vector obj to array object
//		v.elementAt(int index): E;
//		v.elements(): Enumeration;//
//		v.firstElement():E;
//		v.lastElement():E;
//		v.insertElementAt(obj, index):void;
//		v.removeAllElements():void;
//		v.removeElementAt(index):void;
//		v.removeElement(obj):boolean;
//		v.setElementAt(obj, index):void;
		
		Enumeration e = v.elements();
//		hasMoreElement():boolean
//		nextElement():Object;
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println(v.getClass().getSimpleName());//just for reference ..see getName() also
		System.out.println(e.getClass().getName());//prints java.util.Vector$1 //anonymous inner class
		//we are getting object of Enumeration implementation object
		//as interface holds implementation class object
	}
}
