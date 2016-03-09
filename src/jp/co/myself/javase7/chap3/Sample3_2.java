package jp.co.myself.javase7.chap3;

class Outer2 {
	private int val1 = 100;
	private static int val2 = 200;
	class A {
		void method() {
			System.out.println("instance val : " + val1);
		}
	}
	static class B {
		static void method2() {
			System.out.println("static val : " + val2);
		}
	}
}

public class Sample3_2 {
	public static void main(String[] args) {
		Outer2.A a = new Outer2().new A();
		Outer2.B b = new Outer2.B();
		a.method();
		b.method2();
	}
}
