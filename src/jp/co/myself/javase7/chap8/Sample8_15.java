package jp.co.myself.javase7.chap8;

public class Sample8_15 {
	public static void main(String[] args) {
		System.out.println(String.format("|%c|", 65));
		System.out.println(String.format("|%08.1f|", 420.234));
		System.out.println(String.format("|%8.2f|", new Double(420.234)));
		System.out.println(String.format("|%5b|", ""));
		System.out.println(String.format("|%04d|", 12));
		System.out.println(String.format("|%,12d|", 12345678));
	}
}
