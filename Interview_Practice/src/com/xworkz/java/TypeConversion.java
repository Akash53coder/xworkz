package com.xworkz.java;

public class TypeConversion {

	public static String a;
	public String b;
	
//	TypeConversion(){
//		super();
//	}

	String customerName;
	   public TypeConversion(String b) {
		   a = b;
		   System.out.println(a + " "+ TypeConversion.a); //no need to class Name here
	   }
	   public void display () {
	     System.out.println("Customer Name : "+a); // Output :- Customer Name : null
	   }
	
	

	public static void main(String[] args) {
		TypeConversion t = new TypeConversion("akash");
		t.display();
//		System.out.println(t.a);
//		System.out.println(a.toUpperCase());
//		System.out.println(t.b);
//		System.out.println(TypeConversion.a);
		
	}

}
