package jp.co.myself.javase7.chap2;

abstract class Foo4 {
	static String str = "Foo";
	static void methodA() {
		System.out.println(str);
	}
	abstract void methodB();
}

public class Sample2_8 {
	
	public static void main(String[] args) {
		Foo4.methodA();
	}
	
}
