package jp.co.myself.javase7;

class Foo2 {
	static {
		System.out.println("Foo2クラス: static {}");
	}
	{
		System.out.println("Foo2クラス: {}");
	}
	public Foo2(int a) {
		System.out.println("Foo2クラス: Foo(int a)");
	}
	public Foo2() {
		System.out.println("Foo2クラス: Foo()");
	}
}

public class Sample1_10 {
	static {
		System.out.println("Sample1_10クラス: static {}");
	}
	public static void main(String[] args) {
		System.out.println("Sample1_10クラス: main()");
		Foo2 f1 = new Foo2();
		Foo2 f2 = new Foo2(100);
	}
}
