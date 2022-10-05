package com.xworkz.exception;

class CustomRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// for any custom exception we can have constructor or toString() [overriding]
	public CustomRuntimeException(String msg) {
		super(msg);
	}

//	@Override
//	public String toString() {
//		return "exception message";
//	}
	
}
public class CustomRuntimeExceptionRunner {

	public void checkUser(String ename){

		if (!ename.equals("akash")) {
			throw new CustomRuntimeException("wrong employee id");
		}
	}
	
	public static void main(String[] args) {
		try {
			new CustomRuntimeExceptionRunner().checkUser("asa");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}
