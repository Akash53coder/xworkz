package com.xworkz.java;

public class Wrappers {

	public static void main(String[] args) {
				
		//number format Exception
//		String s = "as";
//		Integer i = Integer.parseInt(s);
//		System.out.println(i);
		
		//unboxing for all types
		Byte b = 10;
//		System.out.println(b.byteValue());
		//or can be 
		byte b1 = b.byteValue();
		System.out.println(b1);
		//Byte also has in it similar way all other wrapper classes have all methods to convert to other
		//prmitive types
//		byte byteValue()
//		short shortValue()
//		int intValue()
//		long longValue()
//		float floatValue()
//		double doubleValue()
		
		
		
		Short s = 10;
		System.out.println(s.shortValue());
		
		
		Integer i = 10;
		System.out.println(i.intValue());
		
		Float f = 10.4f;
		System.out.println(f.floatValue());
		
		//same like this for Double and Long
		
		
		
		//compareTo() Compares this Number object to the argument.
		
		//int compareTo(Integer anotherInteger)
		Integer i1 = 10;
		int i2 = i1.compareTo(12); //takes another Integer Object but new Integer() is depricted
		System.out.println(i2);
		
		//similarly 
//		int compareTo(Byte anotherByte)
//		int compareTo(Double anotherDouble)
//		int compareTo(Float anotherFloat)
//		int compareTo(Integer anotherInteger)
//		int compareTo(Long anotherLong)
//		int compareTo(Short anotherShort)
		
		
		//each Number classes have some methods to convert numbers to and form string and for converting
		//between number systems I have considered only Integer, methods are similar to all other wrapper classes

		//converts any Integer value to String obj
				Integer i3 = 12;
				String s1 = i3.toString();
				
				
		//all these are static methods
		
		//static int parseInt(String s)	
		String k = "10";
		int val = Integer.parseInt(k);
		//can also be, autoboxing happens
		Integer val1 = Integer.parseInt(k);
				
		//non-static method
		Integer kq = 10;
		String se = kq.toString();
		
		//converts an int type to String
		//static method
		int val3 = 10;
		String s4 = Integer.toString(val3);
		
		//conversion of Integer to other types
		
		int val5 = 10;
		//only for converting from int to Integer autoboxing
		Integer kw = Integer.valueOf(val5);
		
		//coversion of 
		String s3 = "12";
		Integer ko = Integer.valueOf(s3);
		
	
		
		
		
	}
}
