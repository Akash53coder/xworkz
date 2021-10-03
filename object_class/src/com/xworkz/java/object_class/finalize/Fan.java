package com.xworkz.java.object_class.finalize;

public class Fan {

	String brand="usha";

	@Override
	public String toString() {
		return "Fan [brand=" + brand + "]";
	}
	
//	 @SuppressWarnings("deprecation")
//	protected void finalize() throws Throwable
//	    {
//	        try {
//	  
//	            System.out.println("inside demo's finalize()");
//	        }
//	        catch (Throwable e) {
//	  
//	            throw e;
//	        }
//	        finally {
//	  
//	            System.out.println("Calling finalize method"
//	                               + " of the Object class");
//	  
//	            // Calling finalize() of Object class
//	            super.finalize();
//	        }
//	    }
	
	@Override
	protected void finalize() throws Throwable{
		try {
			System.out.println("inside finalize methos");
		}
		finally {
			System.out.println("exceuting finalze");
			super.finalize();
		}
	}
	
}
