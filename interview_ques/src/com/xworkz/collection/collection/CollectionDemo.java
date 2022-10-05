package com.xworkz.collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//the disadvantage of arrays (arrays are internally objects)
//1. fixed size, we cannot decrease and increase it's size
//2.arrays can hold homogeneous data 
//Student[] student = new Student[10]; can only hold Student objects not Customer Objects
//else I can use Object[] obj = new Object[100];
//3. arrays don't have any underlying data structures. it's just memory level concept
//so we don't have any built in methods (example to sort) need to write code.
//ex. and to search any element (we have contains in collection but not in array)

		//tip: arr = {12,12,12,13} => compile time initialization
		
		//int[] arr = new int[10]; 
		//arr[1] = 10; runtime initialization

//Collections are growable in nature .. (we can increase or decrease the size based on requirement)
//Collections hold homogeneous and heterogeneous objects. 
//ex. List l = new ArrayList(); l.add(""), l.add(new Student());
//every collection is having underlying data structures. and have built in methods 


//Disadvantages of collection classes
//performance wise collections are not up to the mark.
//initial capacity = 10, if I want to add 11th element then, new arraylist is created 
//by copying all the 10 elements performance if low.
//if we know the size of array in advance, go for arrays.

//arrays are language feature, but collections are API features.

//What is collection -> group of individual objects, represented as single entity
//individual objects may of any type. and collection framework (or library) has many
//collection classes and interface to represent that represents how these individual objects
//are stored and order of storing, duplicates are allowed or not.
public class CollectionDemo {

	public static void main(String[] args) {
		
		Collection c =  new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(1);
		c.add(3);
		
		System.out.println(c);//toString here it is overridden to print [1,2,3,1,3]
		
		Iterator i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
//key interfaces of collection framework

//1. Collection : common methods applicable for any collection (root interface)
//and there no concrete class that implements collection directly. but we have interfaces 
//that extends collection

// Collection                   |             Collections 
// -----------------------------|---------------------------
// Interface                    |	   it's a class
// want to represent group of 	| it defines some utility methods for collection objects like(sort)
// objects into a single entity |		


//2. List
//3. Set
//4. SortedSet
//5. NavigableSet
//6. Queue
//7. Map
//8. SortedMap
//9. NavigableMap

//(see hierarchy diagram in notes)

//List: represent individual objects where duplicates are allowed and insertion order preserved
//Set : duplicates not allowed, insertion order not required.

