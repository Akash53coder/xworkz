package com.xworkz.exception;

class MyExp extends Exception{
	
	private static final long serialVersionUID = 1L;

	public MyExp(String msg) {
		super(msg);
	}
}
public class CustomExpTwo {
	public static void main(String[] args) {
		try {
			throw new MyExp("something");
		} catch (NullPointerException e) {
			
		}
		catch(IndexOutOfBoundsException e) {
			
		}
		catch(MyExp e) {
			
		}
	}
}
