package com.xworkz.java.jdbc_pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadMultipleRecordsQuery {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/students";
		String userName = "root";
		String password = "Akash@006";
		String readMultipleRecordQuery = "select * from student_details";
		Connection connection=null;

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			//sending sql query from java program to db engine we need statement object
			connection = DriverManager.getConnection(url,userName,password);
			Statement statement = connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readMultipleRecordQuery);//excecute for read DQL
			
			//resultSet always pointing to the first record 
			//System.out.print(resultSet.getInt(1)+" ");//indicating column student rollno //result it gives before start of the result set
			//System.out.print(resultSet.getString(2)+" ");//indicating column student name//result it gives before start of the result set
			//System.out.print(resultSet.getInt(3)+" ");//indicating column student name//result it gives before start of the result set
			
			resultSet.next(); //it is posiotioned at first row (my first row is column so we use next() method)
			System.out.print(resultSet.getInt(1)+" ");//indicating firs row student rollno 
			System.out.print(resultSet.getString(2)+" ");//indicating firs row student name
			System.out.print(resultSet.getInt(3)+" ");//indicating firs row student name
			
			System.out.println();
			System.out.println("-----------second row data--------------");
			
			resultSet.next(); //it is posiotioned at second row (my first row is column so we use next() method)
			System.out.print(resultSet.getInt(1)+" ");//indicating second row student rollno 
			System.out.print(resultSet.getString(2)+" ");//indicating second row student name
			System.out.print(resultSet.getInt(3)+" ");//indicating second row student name
			
			System.out.println();
			System.out.println("-----------third row data--------------");
			
			resultSet.next(); //it is posiotioned at second row (my first row is column so we use next() method)
			System.out.print(resultSet.getInt(1)+" ");//indicating second row student rollno 
			System.out.print(resultSet.getString(2)+" ");//indicating second row student name
			System.out.print(resultSet.getInt(3)+" ");//indicating second row student name
			
			System.out.println();
			System.out.println("-----------Fourth row data--------------");
			
			resultSet.next(); //it is posiotioned at Fourth row (my first row is column so we use next() method)
			System.out.print(resultSet.getInt(1)+" ");//indicating Fourth row student rollno 
			System.out.print(resultSet.getString(2)+" ");//indicating Fourth row student name
			System.out.print(resultSet.getInt(3)+" ");//indicating Fourth row student name

		}catch( SQLException e) {

			System.out.println(e.getMessage());
		}
		finally {
			connection.close();
		}
	}

}
