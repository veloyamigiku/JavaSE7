package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sample10_6 {
	public static void main(String[] args) {
		String sql = "insert into mytableA values (?, ?, ?)";
		
		try (Connection con = DbConnector.getConnect();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			int col = 0;
			for (int i = 0; i < 100; i++) {
				pstmt.setInt(1, i);
				pstmt.setInt(2, i * 3000);
				pstmt.setString(3, "001");
				pstmt.executeUpdate();
				col++;
			}
			System.out.println(col + "レコード挿入しました。");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
