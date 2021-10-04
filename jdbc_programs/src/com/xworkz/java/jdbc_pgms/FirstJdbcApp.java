package com.xworkz.java.jdbc_pgms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstJdbcApp {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/students";
		//here mysql can be replaced by any other database
		String userName="root";
		String password="Akash@006";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// here Driver is a class
			Connection connection=DriverManager.getConnection(url,userName,password);
			System.out.println("connection established "+url);
			
		}catch(SQLException | ClassNotFoundException exception) {
			System.out.println("connection failed "+exception.getMessage());
		}
	}
}
