package com.xworkz.java.object_class.clone.deep_copy;

public class DeepCopyTest {

	public static void main(String[] args) {

		Lock lock = new Lock("godrej");
		Door door = new Door("wooden",lock);
		Door doorCopy=null;
		
		try {
			 doorCopy=door.clone();
			 doorCopy.lock.brand="yuropa";
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(door);
		System.out.println(doorCopy);
		
		
	}

}
