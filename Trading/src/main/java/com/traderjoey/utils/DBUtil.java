package com.traderjoey.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import com.traderjoey.exception.SqlConnectionFailException;

public class DBUtil {
	private static String driverString = "com.mysql.jdbc.Driver";
	private static String urlString = "jdbc:mysql://localhost:3306/traderjoey";
	private static String userString = "root";
	private static String passwordString = "admin";
	private static Connection connection = null;

	@Test
	public static Connection getConnection() {
		try {
			Class.forName(driverString);
			connection = DriverManager.getConnection(urlString, userString, passwordString);
			connection.setAutoCommit(false);
			if (connection == null) {
				throw new SqlConnectionFailException();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}

}
