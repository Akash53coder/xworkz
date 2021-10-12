package com.xworkz.java.jdbc_pgms.dao.dao_modfied.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static String url="jdbc:mysql://localhost:3306/students";
	public static String username = "root";
	public static String password = "Akash@006";
	private static Connection connection=null;

	static {
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("connection established");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void closeDbConnection() {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
