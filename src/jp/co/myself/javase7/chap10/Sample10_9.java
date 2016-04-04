package jp.co.myself.javase7.chap10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample10_9 {
	public static void main(String[] args) {
		String sql = "select illust from myblob where file_name = ?";
		try (Connection con = DbConnector.getConnect();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, "10_8.png");
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Blob blob = rs.getBlob(1);
				byte[] b = blob.getBytes(1, (int)blob.length());
				try (FileOutputStream output = new FileOutputStream(new File("10_8_copy.png"))) {
					output.write(b);
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
