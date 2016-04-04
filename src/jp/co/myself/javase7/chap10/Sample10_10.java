package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class Sample10_10 {
	public static void main(String[] args) {
		try (Connection con = DbConnector.getConnect()) {
			DatabaseMetaData mData = con.getMetaData();
			String driverName = mData.getDriverName();
			String driverVersion = mData.getDriverVersion();
			String productName = mData.getDatabaseProductName();
			String productVersion = mData.getDatabaseProductVersion();
			System.out.println("DriverName : " + driverName);
			System.out.println("DriverVersion : " + driverVersion);
			System.out.println("ProductName : " + productName);
			System.out.println("ProductVersion : " + productVersion);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
