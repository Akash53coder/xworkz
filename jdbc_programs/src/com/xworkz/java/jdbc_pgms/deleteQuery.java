package com.xworkz.java.jdbc_pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteQuery {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/students";
		String userName = "root";
		String password = "Akash@006";
		String updateQuery = "delete from student_details where student_rollno=5";
		Connection connection=null;
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			//sending sql query from java program to db engine we need statement object
			 connection = DriverManager.getConnection(url,userName,password);
			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery);	
			System.out.println("Data Deleted successfully");
			
		}catch( SQLException e) {
			
			System.out.println(e.getMessage());
		}
		finally {
			 connection.close();
		}
	}
}
