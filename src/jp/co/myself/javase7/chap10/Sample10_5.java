package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample10_5 {
	public static void main(String[] args) {
		String sql = "delete from department where dept_code = " + args[0];
		
		try (Connection con = DbConnector.getConnect();
				Statement stmt = con.createStatement()) {
			int col = stmt.executeUpdate(sql);
			System.out.println("col : " + col);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
