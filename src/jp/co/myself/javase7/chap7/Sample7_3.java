package jp.co.myself.javase7.chap7;

import java.io.FileReader;
import java.io.IOException;

public class Sample7_3 {
	
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader(".gitignore");
			fr.read();
		//} catch (FileNotFoundException | IOException) {
		// 継承関係のある例外クラスをキャッチに列挙するとコンパイルエラーになります。
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
