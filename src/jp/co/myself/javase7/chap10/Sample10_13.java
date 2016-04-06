package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample10_13 {
	public static void main(String[] args) {
		String sql = "select dept_code, dept_address from department where dept_code = 4";
		
		try (Connection con = DbConnector.getConnect();
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery(sql)) {
			DatabaseMetaData m = con.getMetaData();
			System.out.printf("[CONCUR_READ_ONLY] %s\n", m.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY));
			System.out.printf("[CONCUR_UPDATABLE] %s\n", m.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE));
			System.out.println();
			if (rs.next()) {
				System.out.println(rs.getString(2));
			}
			rs.updateString(2, "Chiba");
			rs.updateRow();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
