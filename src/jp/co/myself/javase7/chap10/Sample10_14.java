package jp.co.myself.javase7.chap10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sample10_14 {
	public static void main(String[] args) {
		String sqlC = "insert into mytablec values (?, ?, ?)";
		//String sqlD = "insert into mytabled values (?, ?, ?)";
		String sqlD = "insert into incorrect_table values (?, ?, ?)";
		int[] field4 = {10, 11, 12};
		String[] field5 = {"x", "y", "z"};
		try (Connection con = DbConnector.getConnect()) {
			try (PreparedStatement cp = con.prepareStatement(sqlC);
					PreparedStatement dp = con.prepareStatement(sqlD)) {
				con.setAutoCommit(false);
				cp.setInt(1,  1);
				cp.setInt(2, 5000);
				cp.setInt(3,  1001);
				cp.executeUpdate();
				System.out.println("mytableCにレコードを追加しました。");
				for (int i = 0; i < 3; i++) {
					dp.setInt(1, 1001);
					dp.setInt(2, field4[i]);
					dp.setString(3, field5[i]);
					dp.executeUpdate();
					System.out.println("mytableDにレコードを追加しました。");
				}
				con.commit();
				System.out.println("コミットしました。");
			} catch (SQLException e) {
				if (con != null) {
					con.rollback();
					System.out.println("ロールバックしました。");
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
