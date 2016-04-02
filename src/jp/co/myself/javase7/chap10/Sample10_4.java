package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample10_4 {
	public static void main(String[] args) {
		String sql = "update department set dept_address='Tokyo', pilot_number='03-6666-xxxx' where dept_code = " + args[0];
		try (Connection con = DbConnector.getConnect();
				Statement stmt = con.createStatement()) {
			int col = stmt.executeUpdate(sql);
			System.out.println("col : " + col);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
