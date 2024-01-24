package com.org.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
	public static Connection getConObj() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
			return connection;
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

}
