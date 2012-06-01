package de.bag.bestellsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Database {
	private Connection conn;
	private Statement statement = null;
	private ResultSet resultSet = null;

	private void openConnection() {
		Properties properties = new Properties();
		properties.put("user", "andreas");
		properties.put("password", "misterpanda1");
		properties.put("characterEncoding", "ISO-8859-1");
		properties.put("useUnicode", "true");
		String url = "jdbc:derby://localhost:1527/../../Bestellsystem;";

		try {
			conn = DriverManager.getConnection(url, properties);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		openConnection();
		return conn;
	}
	
	public Statement getStatement(){
		try {
			openConnection();
			statement = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statement;
	}
	
	public ResultSet executeQuery(String query){
		try {
			resultSet = getStatement().executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	
	
	
	  

}