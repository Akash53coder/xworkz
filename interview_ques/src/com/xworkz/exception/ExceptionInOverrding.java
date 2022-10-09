package com.xworkz.exception;

import java.io.IOException;

//	super class         |  subclass	   | acceptance
//______________________|______________|____________
//   checked			|  checked     | yes    
//   checked			|  unchecked   | yes
//   checked			|  nothing     | yes
//   unchecked			|  unchecked   | yes
//   no-exception       |  unchecked   | yes
//   unchecked			|  checked	   | not
//   no-exception       |  checked     | not

class SuperExcp{
	
	public void m1() throws IOException{
		
	}
	
	public void m2() throws NullPointerException{
		
	}
	
	public void m3() {
		
	}
	
	public void m4() {
		
	}
	
	public void m5() throws IOException{
		
	}
}
public class ExceptionInOverrding extends SuperExcp{

	//while overriding method from super class, I can declare a unchecked exception on 
	//Overridden method
	@Override
	public void m1() throws NullPointerException{
		
	}
	
	//while overriding method from super class which is throwing unchecked exception
	//then I can't declare checked exception
//	@Override
//	public void m2() throws IOException{
//		
//	}
	
	//while overriding method from super class, which is not throwing any exception
	//then I can't declare checked exception
//	@Override
//	public void m3() throws IOException{
//		
//	}
	
	//while overriding method from super class, I can declare a unchecked exception on 
	//Overridden method
	@Override
	public void m4() throws ArithmeticException{
		
	}
	
	//while overriding method from super class, which is throwing checked exception
	//I may not declare it
	@Override
	public void m5() {
		
	}
}
