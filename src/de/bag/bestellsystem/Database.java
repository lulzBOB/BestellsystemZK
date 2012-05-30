package de.bag.bestellsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public Database() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException  {
			Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			connect = DriverManager.getConnection("jdbc:derby://localhost/C:/Users/afast/workspace/DatabaseBestellsystem");

	}

	public void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}

}