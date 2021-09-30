package com.xworkz.java.object_class.clone;

public class Bus implements Cloneable{

	String name="scania";
	Driver driver=new Driver();// we can do like this we can directly create a object
								// rather than creating constructor.

	public Object cloneee() throws CloneNotSupportedException{
		return super.clone();
	}

	// or we can use 
	
//	public Bus cloneee() throws CloneNotSupportedException{
//		return (Bus)super.clone();
//	}
	
	@Override
	public String toString() {
		return "Bus [name=" + name + ", driver=" + driver + "]";
	}
	
	

}

