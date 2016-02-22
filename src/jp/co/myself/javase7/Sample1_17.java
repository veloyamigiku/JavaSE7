package jp.co.myself.javase7;

public class Sample1_17 {
	
	public static void main(String[] args) {
		Foo6 f1 = new Foo6();
		Foo6 f2 = new Foo6();
		System.out.println("f1:" + f1.hashCode());
		System.out.println("f2:" + f2.hashCode());
		Foo6 f3 = new Foo6();
		Foo6 f4 = f3;
		System.out.println("f3:" + f3.hashCode());
		System.out.println("f4:" + f4.hashCode());
	}
}
