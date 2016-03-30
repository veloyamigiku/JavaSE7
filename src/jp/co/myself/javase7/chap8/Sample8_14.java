package jp.co.myself.javase7.chap8;

import java.util.Formatter;

public class Sample8_14 {
	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		System.out.println(formatter.format("|%c|", 65));
		System.out.println(formatter.format("|%08.1f|", 420.234));
		System.out.println(formatter.format("|%8.2f|", new Double(420.234)));
		System.out.println(formatter.format("|%5b|", ""));
		System.out.println(formatter.format("|%04d|", 12));
		System.out.println(formatter.format("|%,12d|", 12345678));
		System.out.println(formatter.toString());
	}
}
