package com.xworkz.stringdemoex;


//standard rules to create our own immutable class

// 1. the class must be final so that subclasses don't override methods
// 2. Make all your fields final, so that they’re initialized only once inside 
//    the constructor and never modified afterward.
// 3. provide only getter methods. Don't provide setter methods 
//    i.e don't give direct access
// 4. When exposing methods which modify the state of the class, you must always 
//   return a new instance of the class.
// 5. If the class holds a mutable object:
// Inside the constructor, make sure to use a clone copy of the passed argument and never set your 
// mutable field to the real instance passed through constructor, this is to prevent the clients who 
// pass the object from modifying it afterwards.
// Make sure to always return a clone copy of the field and never return the real object instance.

//java classes that are immutable 
// String , Wrapper classes, java.util.Locale, java.util.UUID etc

//advantages 
//thread safe, memory usage, do not need a copy constructor, Performance(SCP)


//follow this https://dzone.com/articles/how-to-create-an-immutable-class-in-java
public final class ImmutableStudent {

	//final variables always ask you to initialize
	private final String name;
	private final int id;
	private final Age age;
	

	public ImmutableStudent(String name, int id, Age age) {
		super();
		this.name = name;
		this.id = id;
		//deep copy in contructor itself
		Age clone = new Age();
		clone.setYear(age.getYear());
		this.age = clone;
	}

	//setters are not allowed because as per the rule of immutability

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Age getAge() {
		Age clone = new Age();
		clone.setYear(this.age.getYear());
	    return clone;
	}
	
	public static void main(String[] args) {
		
		Age age = new Age();
	    age.setYear(1992);
		ImmutableStudent student = new ImmutableStudent("akash",1,age);
		
		System.out.println("student age year = " + student.getAge().getYear());
		
		//1.prone to modify //solution creating a cloned object in constructor
		age.setYear(1990);
		
		//2.prone to modify //solution is returning a cloned object not student's age object
		
		student.getAge().setYear(1993);
		
		System.out.println("student age year = " + student.getAge().getYear());
	}
	
}
