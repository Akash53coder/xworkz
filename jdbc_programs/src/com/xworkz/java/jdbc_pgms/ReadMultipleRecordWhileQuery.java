package com.xworkz.java.jdbc_pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadMultipleRecordWhileQuery {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/students";
		String userName = "root";
		String password = "Akash@006";
		String readSingleRecordQuery = "select * from student_details";
		Connection connection=null;

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			//sending sql query from java program to db engine we need statement object
			connection = DriverManager.getConnection(url,userName,password);
			Statement statement = connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readSingleRecordQuery);//excecute for read DQL


			while(resultSet.next()) { //it is posiotioned at first row (my first row is column so we use next() method)
				System.out.println();
				System.out.print(resultSet.getInt(1)+" ");//indicating next row student rollno 
				System.out.print(resultSet.getString(2)+" ");//indicating next row student name
				System.out.print(resultSet.getInt(3)+" ");//indicating next row student name
			}

		}catch( SQLException e) {

			System.out.println(e.getMessage());
		}
		finally {
			connection.close();
		}
	}
}
