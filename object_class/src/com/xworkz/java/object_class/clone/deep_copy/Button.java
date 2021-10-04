package com.xworkz.java.object_class.clone.deep_copy;

public class Button {

	String type="square";
	
	public Button(String type) {
		super();
		this.type = type;
	}	

	@Override
	public String toString() {
		return "Button [type=" + type + "]";
	}
}
