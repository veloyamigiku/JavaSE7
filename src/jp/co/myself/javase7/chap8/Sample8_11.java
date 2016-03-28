package jp.co.myself.javase7.chap8;

import java.io.Console;

public class Sample8_11 {
	
	public static void main(String[] args) {
		Console console = System.console();
		while (true) {
			String str = console.readLine();
			if (str.equals("")) {
				break;
			}
			System.out.println("入力されたデータ :" + str);
		}
	}
}
