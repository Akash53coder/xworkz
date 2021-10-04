package com.xworkz.java.object_class.clone;

public class Shirt implements Cloneable{

	String brand="peter england";
	Button button= new Button();
	
	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", button=" + button + "]";
	}
	
	public Object cloning() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
