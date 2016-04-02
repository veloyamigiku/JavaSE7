package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample10_1 {
	
	private static final String URL = "jdbc:mysql://localhost/golddb";
	
	private static final String USER = "root";
	
	private static final String PASS = "root";
	
	private static final String SQL = "select dept_code, dept_name from department";
	
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(URL, USER, PASS);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(SQL)) {
			while (rs.next()) {
				System.out.println("dept_code : " + rs.getInt(1));
				System.out.println("dept_name : " + rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
