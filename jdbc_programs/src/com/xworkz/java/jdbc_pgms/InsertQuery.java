package com.xworkz.java.jdbc_pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String[] args) throws SQLException {

		String url="jdbc:mysql://localhost:3306/students";
		String userName = "root";
		String password = "Akash@006";
		String insertQuery = "INSERT INTO student_details values(5,'louis',9)";
		Connection connection=null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//sending sql query from java program to db engine we need statement object
			connection = DriverManager.getConnection(url,userName,password);
			Statement statement = connection.createStatement();
			statement.executeUpdate(insertQuery);	
			System.out.println("Data inserted successfully");

		}catch(ClassNotFoundException | SQLException e) {

			System.out.println(e.getMessage());
		}
		finally {
			connection.close();
		}

	}

}
