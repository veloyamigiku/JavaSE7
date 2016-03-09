package jp.co.myself.javase7.chap3;

class Outer6 {
	private static int a = 1;
	private int b = 2;
	void methodOuter(final int c, int d) {
		final int e = 5;
		int f = 6;
		class A {
			void method() {
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d);
				System.out.println("e : " + e);
				//System.out.println("f : " + f);
			}
		}
		new A().method();
	}
}

public class Sample3_6 {
	
	public static void main(String[] args) {
		Outer6 o = new Outer6();
		o.methodOuter(3, 4);
	}
	
}
