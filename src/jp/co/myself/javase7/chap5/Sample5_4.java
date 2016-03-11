package jp.co.myself.javase7.chap5;

public class Sample5_4 {
	
	public static void main(String[] args) {
		double d1 = 10;
		//Double d2 = 10; 暗黙の型変換(Autoboxing)はできません。
		Double d2 = 10.0;
		Short num1 = 10;
		method(num1);
		int num2 = 100;
		//method(num2); 暗黙の型変換(Autoboxing)はできません。
	}
	
	static void method(short obj) {
		System.out.println("short");
	}
	
	static void method(Short obj) {
		System.out.println("Short");
	}
	
	static void method(Long obj) {
		System.out.println("Long");
	}
}
