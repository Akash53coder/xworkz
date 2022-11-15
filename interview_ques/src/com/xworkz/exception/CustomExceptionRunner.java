package com.xworkz.exception;

class CustomException extends Exception {

	private static final long serialVersionUID = 1L;

	// for any custom exception we can have constructor or toString() [overriding]
	public CustomException(String msg) {
		super(msg);
	}

//	@Override
//	public String toString() {
//		return "exception message";
//	}
	
}

public class CustomExceptionRunner {

	public void checkUser(String ename) throws CustomException {

		if (!ename.equals("akash")) {
			throw new CustomException("invalid user");
		}
	}

	public static void main(String[] args) //throws CustomException {
	{
		//if I try to add throws then default exception handler will terminates the program
			try {
				new CustomExceptionRunner().checkUser("ads");
			} catch (CustomException e) {
				System.out.println(e.getMessage());
			}
		
			//If I add throws this code will not be executed
		for(int i=0;i<2;i++) {
			System.out.println(i);
		}

	}
}
