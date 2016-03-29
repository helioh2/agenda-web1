package br.ufpr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionFactory {

	 public Connection getConnection() {
	        try {
	        	Class.forName("com.mysql.jdbc.Driver");
	        	//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	            return DriverManager.getConnection(
	          "jdbc:mysql://localhost/agenda", "root", "root");
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException(e);
			}

	   }
	
}
