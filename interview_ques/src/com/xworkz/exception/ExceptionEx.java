package com.xworkz.exception;

public class ExceptionEx {

	public static void main(String[] args) {

		// for these examples see probabilities of execution
//		try {
//			int i=9/0;
//			System.out.println(i);
//			return;
//		} catch (Exception e) {
//			System.out.println("exception caught");
//			return;
//		}
//		//this is unreachable code
//		System.out.println("task completed");

		String val = method1();
		System.out.println(val);

	}

	public static String method1() {
		// finally block will always executes even if we have return in try
		// here try block started it’s execution and no exception so it goes to
		// finally and then return back to caller.
//		try {
//			int i = 9;
//			System.out.println(i);
//			return "from try";
//		} catch (Exception e) {
//			System.out.println("exception caught");
//			return "from catch";
//		} finally {
//			System.out.println("finally block executing");
//		}

//		try {
//			int i = 9;
//			System.out.println(i);
//			return "from try";
//		} catch (Exception e) {
//			System.out.println("exception caught");
//			return "from catch";
//		} finally {
//			System.out.println("finally block executing");
//			return "from finally";
//		}
		
		//finally block only doen't get executed if I have System.exit(0) 
		//in try or catch block
		
		try {
            int i = 9/0;
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("exception caught");
            return "from catch";
        } finally {
            System.out.println("finally block executing");
        }
        System.out.println("end");
        return "from end";
		
	}
}
