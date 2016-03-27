package jp.co.myself.javase7.chap7;

import java.sql.SQLException;

class MyResource2 implements AutoCloseable {
	private String msg;
	public MyResource2(String msg) {
		this.msg = msg;
	}
	public void method() throws SQLException {
		throw new SQLException("method()でのエラー");
	}
	@Override
	public void close() throws SQLException {
		System.out.println("close() : " + msg);
		throw new SQLException("close()でのエラー:" + msg);
	}
}

public class Sample7_10 {
	public static void main(String[] args) {
		try (MyResource2 obj1 = new MyResource2("obj1");
				MyResource2 obj2 = new MyResource2("obj2")) {
			obj1.method();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			Throwable[] errAry = e.getSuppressed();
			System.out.println("抑制例外数:" + errAry.length);
			for (Throwable ex : errAry) {
				System.out.println(ex.getMessage());
			}
		} finally {
			System.out.println("finallyブロック");
		}
	}
}
