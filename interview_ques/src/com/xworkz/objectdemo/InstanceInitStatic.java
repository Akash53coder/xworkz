package com.xworkz.objectdemo;

public class InstanceInitStatic {

	private String name;
	private int id;
	private static int rono;
	//object's constant
	private final String branchId;
	//naming convention always upper case and '_'
	//this is class constant
	private final static String COLLEGE_NAME;
	
	//instant initialization block
	
	{
		System.out.println("instance intialization block");
		this.name = "adarsh";
		this.id = 1;
		this.branchId = "CSE973";
	}
	
	//static variables are global variables, which are shared by all instances of the class
	//A static block gets executed only once.
	static {
		System.out.println("static");
		rono = 12;
		COLLEGE_NAME = "AIT";
	}
	
	public InstanceInitStatic(int id, String name) {
		System.out.println("constructor");
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		InstanceInitStatic i = new InstanceInitStatic(2, "akash");
		System.out.println(i.id);
		System.out.println(i.name);
		System.out.println(InstanceInitStatic.rono);
	}
}
