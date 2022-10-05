package com.xworkz.exception;

import java.io.IOException;

class SuperExcp2{
	
	public void m1() throws IOException{
		
	}
	
	public void m2() throws NullPointerException{
		
	}
	
	public void m3() throws Exception {
		
	}
}
public class ExceptionInOverrding2 extends SuperExcp2{

	//uncomment -> error
//		public void m1() throws Exception{
//	}
	
	public void m2() throws RuntimeException{
		
	}
	
	public void m3() throws IOException{
		
	}
}
