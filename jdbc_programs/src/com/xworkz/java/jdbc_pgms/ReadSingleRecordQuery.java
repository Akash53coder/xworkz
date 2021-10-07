package com.xworkz.java.jdbc_pgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadSingleRecordQuery {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/students";
		String userName = "root";
		String password = "Akash@006";
		String readSingleRecordQuery = "select * from student_details where student_rollno=1";
		Connection connection=null;

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//optional for type-4 drivers
			//sending sql query from java program to db engine we need statement object
			connection = DriverManager.getConnection(url,userName,password);
			Statement statement = connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readSingleRecordQuery);//excecute for read DQL

			//resultSet always pointing to the first record i.e column
			//System.out.print(resultSet.getInt(1)+" ");//indicating column student rollno //result it gives before start of the result set
			//System.out.print(resultSet.getString(2)+" ");//indicating column student name//result it gives before start of the result set
			//System.out.print(resultSet.getInt(3)+" ");//indicating column student name//result it gives before start of the result set

			resultSet.next(); //it is posiotioned at first row (my first row is column so we use next() method)
			System.out.print(resultSet.getInt(1)+" ");//indicating first row student rollno 
			System.out.print(resultSet.getString(2)+" ");//indicating first row student name
			System.out.print(resultSet.getInt(3)+" ");//indicating first row student name


		}catch( SQLException e) {

			System.out.println(e.getMessage());
		}
		finally {
			connection.close();
		}
	}

}
