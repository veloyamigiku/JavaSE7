package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample10_12 {
	public static void main(String[] args) {
		String sql = "select dept_name from department";
		
		try (Connection con = DbConnector.getConnect();
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery(sql)) {
			DatabaseMetaData m = con.getMetaData();
			System.out.printf("[TYPE_FORWARD_ONLY] %s\n", m.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY));
			System.out.printf("[TYPE_SCROLL_INSENSITIVE] %s\n", m.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
			System.out.printf("[TYPE_SCROLL_SENSITIVE] %s\n", m.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
			rs.last();
			System.out.println("最後の行番号:" + rs.getRow());
			rs.afterLast();
			while (rs.previous()) {
				System.out.println("dept_name:" + rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
