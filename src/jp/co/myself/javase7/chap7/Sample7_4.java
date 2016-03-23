package jp.co.myself.javase7.chap7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample7_4 {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			FileReader rf = new FileReader(".gitignore");
			rf.read();
		} catch (ArithmeticException | FileNotFoundException e) {
			e.printStackTrace();
			// マルチキャッチによる、参照変数への再代入は出来ません。
			//e = null;
		} catch (IOException e) {
			e.printStackTrace();
			e = null;
		}
	}
}
