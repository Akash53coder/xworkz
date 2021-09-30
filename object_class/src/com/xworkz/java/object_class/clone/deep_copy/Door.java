package com.xworkz.java.object_class.clone.deep_copy;

public class Door implements Cloneable{

	String type;
	
	Lock lock;
	
	Door(String type,Lock lock){
		this.type=type;
		this.lock=lock;
	}
	
	public Door clone() throws CloneNotSupportedException  {
		Door doorCopy=(Door)super.clone();
		doorCopy.lock=new Lock("godrej");
		return doorCopy;
	}

	@Override
	public String toString() {
		return "Door [type=" + type + ", lock=" + lock + "]";
	}
	
}
