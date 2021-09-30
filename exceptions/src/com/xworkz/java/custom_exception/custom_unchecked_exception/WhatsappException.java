package com.xworkz.java.custom_exception.custom_unchecked_exception;

public class WhatsappException extends RuntimeException{

	String message;
	
	public WhatsappException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
//	
//	@Override 
//	public String getMessage() {
//		
//		return "Cannot create Group with more than 250 members";
//	}
//	
//	@Override
//	public String toString() {
//		return "Cannot send file >1024 MB";
//	}
//	
}
