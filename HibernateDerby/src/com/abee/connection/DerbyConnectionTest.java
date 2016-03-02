package com.abee.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyConnectionTest {

	public static void main(String[] args) {

		try {

			String dbUrl = "jdbc:derby:abee/derby_git;create=false";
			Connection conn = DriverManager.getConnection(dbUrl, "user", "password");
			if (conn != null) {
				System.out.println("Connected to derby");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
