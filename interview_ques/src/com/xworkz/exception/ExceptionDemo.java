package com.xworkz.exception;

public class ExceptionDemo {

	//errors are unchecked
	//toString(), printStackTrace() and getMessage() are from Throwable,
	//overridden in Exception class
	//exception handling : try-catch propagating it using throws
	//catch block contains throwable object and it's subclasses
	//with throw keyword Any Throwable object type can be thrown.
	//Exception is partially checked
	//Runtime exception and it's subclasses are unchecked. 
	//ex.NullPointerException and IllegalArgumentException
	
	//Methods of Exception class printstackTrace(), getMessage, getLocalizedMessage (we have to 
	//override this to print localized message), getCuase (prints the cause for the exception 
	//if the cause is unknown then it returns null)
	//toString()
	//ClassNotFoundException and NoClassDefFoundException
	
	//difference between exception and error
	
	//exception are due to logical errors or due to code related errors
	//possible to recover
	//java.lang.Exception package
	//may be checked or unchecked 
	
	//errors are due to system resource scarcity (virus, jvm crash, memory full)
	//non recoverable
	//unchecked java.lang.Error
	//(VMError (Parent) -> (child) outOfMemryError, StackOverFlowError)
	//(LinkageError (Parent) -> VerifyError (child))
	
	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		try {
			int k = 10/0;
			try {
				
			}catch(ArithmeticException e) {
				
			}
		}catch(Throwable e) {
			//System.out.println(e.getMessage());// only message /by zero
			//System.out.println(e.toString());// exception class and message
			System.out.println(e.getLocalizedMessage());//similar to getMessage
			//e.printStackTrace();//whole stack trace
			try {
				
			}catch(ArrayIndexOutOfBoundsException a) {
				
			}
		}
		finally {
			//System.out.println("finally");
			try {
				
			}catch (Exception e) {
				
			}
			
		}
	}
	
}
