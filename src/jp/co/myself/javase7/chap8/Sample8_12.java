package jp.co.myself.javase7.chap8;

import java.io.Console;

public class Sample8_12 {
	public static void main(String[] args) {
		Console console = System.console();
		String name = console.readLine("%s", "name :");
		System.out.println("You are " + name);
		char[] pw = console.readPassword("%s", "pw :");
		System.out.print("Your password :");
		for (char c : pw) {
			System.out.print(c);
		}
	}
}
