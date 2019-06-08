package com.traderjoey.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import com.traderjoey.exceptions.SqlConnectionFailException;

public class DBUtil {
	private String driverString = "com.mysql.jdbc.Driver";
	private String urlString = "jdbc:mysql://localhost:3306/traderjoey";
	private String userString = "root";
	private String passwordString = "admin";
	private Connection connection = null;

	@Test
	public Connection getConnection() {
		try {
			Class.forName(driverString);
			connection = DriverManager.getConnection(urlString, userString, passwordString);
			connection.setAutoCommit(false);
			if (connection == null) {
				throw new SqlConnectionFailException();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

}
