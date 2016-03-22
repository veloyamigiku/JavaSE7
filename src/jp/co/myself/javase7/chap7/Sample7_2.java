package jp.co.myself.javase7.chap7;

public class Sample7_2 {
	public static void main(String[] args) {
		int[] num = {10, 0};
		try {
			System.out.print(num[2]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
