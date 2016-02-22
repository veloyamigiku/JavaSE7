package jp.co.myself.javase7.chap1;

public class Sample1_4 {
	
	public static void main(String[] args) {
		String signal = args[0];
		switch (signal) {
		case "red":
			System.out.println("赤");
			break;
		case "yellow":
			System.out.println("黄");
			break;
		case "blue":
			System.out.println("青");
			break;
		default:
			System.out.println("その他");
			break;
		}
	}
	
}
