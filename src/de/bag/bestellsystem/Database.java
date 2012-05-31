package de.bag.bestellsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.util.Properties;


public class Database
{
	private Connection conn;
    
	public Connection openConnection() {
		  Properties properties = new Properties();
		  properties.put("user", "andreas");
		  properties.put("password", "misterpanda1");
		  properties.put("characterEncoding", "ISO-8859-1");
		  properties.put("useUnicode", "true");
		  String url = "jdbc:mysql://hostname/database";

		  Class.forName("com.mysql.jdbc.Driver").newInstance();
		  Connection c = DriverManager.getConnection(url, properties);
		  return c;
		}
}