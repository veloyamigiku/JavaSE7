package jp.co.myself.javase7.chap10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sample10_8 {
	public static void main(String[] args) {
		String sql = "insert into myblob values (?, ?)";
		try (Connection con = DbConnector.getConnect();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, "10_8.png");
			File file = new File("10_8.png");
			FileInputStream input = new FileInputStream(file);
			pstmt.setBlob(2, input, file.length());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
