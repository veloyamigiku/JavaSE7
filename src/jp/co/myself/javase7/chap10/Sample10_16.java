package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample10_16 {
	public static void main(String[] args) {
		String sql = "select dept_name from department";
		try (Connection con = DbConnector.getConnect();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			con.close();
			while (rs.next()) {
				System.out.println("dept_name:" + rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
