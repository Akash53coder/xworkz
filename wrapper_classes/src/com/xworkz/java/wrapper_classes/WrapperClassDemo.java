package com.xworkz.java.wrapper_classes;

public class WrapperClassDemo {

	//buffer concept -128 to 127
	public static void main(String[] args) {
		
		Integer x = 10;//autoboxing internally uses Integer.valueOf();
		Integer y = 10;
		System.out.println(x==y);//true
		
		//or
		
		Integer s = Integer.valueOf(99);
		Integer s1 = Integer.valueOf(99);
		System.out.println(s==s1);//true it also uses buffer concept
		
		Integer a = 100;
		Integer b = 100;
		System.out.println(a==b);//true
		
		Integer m = 128;
		Integer l = 128;
		System.out.println(m==l);//false
		
		Integer c = 1000;
		Integer d = 1000;
		System.out.println(c==d);//false
		
		Boolean w = false;
		Boolean q = false;
		System.out.println(w==q);//true because of boolean buffer concept either true or false
		//no new object is created
		
		
		//no buffer concept is available to float and double
		Float e = 10.2f;
		Float r = 10.2f;
		System.out.println(e==r);//false because new objects are created
		
		//same as above for Double also
		
		
		
	}

}
