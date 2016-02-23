package jp.co.myself.javase7.chap2;

class Foo3 {
	
	public void method(int a) {
		System.out.println("method(int a)");
	}
	
	public void method(long a) {
		System.out.println("method(long a)");
	}
	
	public void method(Integer a) {
		System.out.println("method(Integer a)");
	}
	
	public void method(int... a) {
		System.out.println("method(int... a");
	}
	
	// 上記の可変長引数の定義と重複するので、以下のコードはコンパイルエラーになります。
	/*
	public void method(int[] a) {
		System.out.println("method(int[] a)");
	}
	*/
}

public class Sample2_5 {
	public static void main(String[] args) {
		Foo3 obj = new Foo3();
		obj.method(100);
	}
}
