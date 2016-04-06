package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Sample10_17 {
	public static void main(String[] args) {
		String sql = "select dept_name from department";
		try (Connection con = DbConnector.getConnect();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			RowSetFactory factory = RowSetProvider.newFactory();
			CachedRowSet rowset = factory.createCachedRowSet();
			rowset.populate(rs);
			con.close();
			while (rowset.next()) {
				System.out.println("dept_name:" + rowset.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
