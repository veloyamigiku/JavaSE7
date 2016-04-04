package jp.co.myself.javase7.chap10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Sample10_7 {
	public static void main(String[] args) {
		String csql = "{call myprocedure(?, ?)}";
		try (Connection con = DbConnector.getConnect();
				CallableStatement cstmt = con.prepareCall(csql)) {
			cstmt.setInt(1, 110000);
			cstmt.registerOutParameter(2, java.sql.Types.BIGINT);
			cstmt.execute();
			int result = cstmt.getInt(2);
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
