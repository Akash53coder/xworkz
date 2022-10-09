package com.xworkz.exception;

public class ExceptionDemo {

	//errors are unchecked
	//toString(), printStackTrace() and getMessage() getCause() getLocalizedMessage() 
	//are from Throwable,
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
	
	//exceptions are due to logical errors or due to code related errors
	//possible to recover
	//java.lang.Exception package
	//may be checked or unchecked 
	
	//errors are due to system resource scarcity (virus, jvm crash, memory full)
	//non recoverable
	//unchecked java.lang.Error
	//(VMError (Parent) -> (child) outOfMemryError, StackOverFlowError)
	//(LinkageError (Parent) -> VerifyError (child))
	
	//UnsupportedClassVersionError : java program complied with different java version and run using 
	//other java version.
	
	// What is OutOfMemoryError in Java?
	//OutOfMemoryError in Java is a subclass of java.lang.VirtualMachineError and 
	//it’s thrown by JVM when it ran out of heap memory. We can fix this error by providing 
	//more memory to run the java application through java options. $>java MyProgram -Xms1024m -Xmx1024m -XX:PermSize=64M 
	//-XX:MaxPermSize=256m
	
	
//	ExceptionInInitializerError : 
	
	
//NoClassDefFoundError: This is caused when there is a class file that your code depends on and it is present at 
//compile time but not found at runtime. Look for differences in your build time and runtime class paths.	
//If a class was present during compile time but not available in java classpath during runtime.
	
	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		try {
			int k = 10/0;
			try {
				
			}catch(ArithmeticException e) {
				System.out.println("inside 1st catch");
			}
		}catch(Throwable e) {
			System.out.println("getMessage " + e.getMessage());// only message /by zero
			System.out.println("toString "+e.toString());// exception class and message
			System.out.println("getLocalizedMessage " +e.getLocalizedMessage());//similar to getMessage
			e.printStackTrace();//whole stack trace
			try {
				
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("inside 2nd catch");
			}
		}
		finally {
			System.out.println("finally");
			try {
				
			}catch (Exception e) {
				System.out.println("inside 3rd catch");
			}
			
		}
	}
	
}
