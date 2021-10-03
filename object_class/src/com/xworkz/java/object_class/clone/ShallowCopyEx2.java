package com.xworkz.java.object_class.clone;

public class ShallowCopyEx2 implements Cloneable{
	
	private int someValue=20;

	public static void main(String[] args) {

		ShallowCopyEx2 sce = new ShallowCopyEx2();
		ShallowCopyEx2 copyOfSce=null;
		try {
			 copyOfSce = (ShallowCopyEx2)sce.clone();
		}
		catch(CloneNotSupportedException e) {
			System.err.println("clone not suppoerted exeption"+e);
		}
		
		System.out.println(sce.someValue);
		copyOfSce.someValue=10;
		System.out.println(copyOfSce.someValue);
	}

}
