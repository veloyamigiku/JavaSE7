package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample10_11 {
	public static void main(String[] args) {
		String sql = "select * from department";
		
		try (Connection con = DbConnector.getConnect();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			ResultSetMetaData rData = rs.getMetaData();
			int col = rData.getColumnCount();
			for (int i = 1; i <= col; i++) {
				String name = rData.getColumnName(i);
				String type = rData.getColumnTypeName(i);
				System.out.printf("ColumnName[%s], ColumTypeName[%s]\n", name, type);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
