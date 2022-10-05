package com.xworkz.exception;


import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException2 {

	public static void main(String[] args) {
//		try {
//			testExceptions();
//		} catch (FileNotFoundException | IOException e) {
//			e.printStackTrace();
//		}
		
		//here in catch block handle either FileNotFoundSexception (child) or IOException(parent)
		//or define them in separate catch blocks 
	}
	
	
	
	public static void testExceptions() throws IOException, FileNotFoundException{
		
	}
}
