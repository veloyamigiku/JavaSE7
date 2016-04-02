package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample10_3 {
	public static void main(String[] args) {
		String sql = "insert into department values (6, 'Planning', 'Yokohama', '045-333-xxxx')";
		try (Connection con = DbConnector.getConnect();
				Statement stmt = con.createStatement()) {
			int col = stmt.executeUpdate(sql);
			System.out.println("col : " + col);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
