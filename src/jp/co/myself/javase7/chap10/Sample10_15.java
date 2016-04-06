package jp.co.myself.javase7.chap10;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Sample10_15 {
	public static void main(String[] args) {
		try {
			RowSetFactory factory = RowSetProvider.newFactory();
			JdbcRowSet rowset = factory.createJdbcRowSet();
			rowset.setUrl("jdbc:mysql://localhost/golddb");
			rowset.setUsername("root");
			rowset.setPassword("root");
			rowset.setCommand("select dept_name from department");
			rowset.execute();
			while (rowset.next()) {
				System.out.println("dept_name:" + rowset.getString(1));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
