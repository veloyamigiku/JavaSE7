package jp.co.myself.javase7.chap2;

class Super2 {
	void methodA() {
		System.out.println("Super:methodA()");
	}
	
	static void methodB() {
		System.out.println("Super:methodB()");
	}
}

class Sub2 extends Super2 {
	
	void methodA() {
		System.out.println("Sub:methodA()");
	}
	
	// 非staticなメソッドを、staticにオーバーライドできないため、コンパイルエラーになります。
	/*
	static void methodA() {
		System.out.println("Sub:methodA()");
	}
	*/
	
	static void methodB() {
		System.out.println("Sub:methodB()");
	}
	
	// staticなメソッドを、非staticにオーバーライドできないため、コンパイルエラーになります。
	/*
	void methodB() {
		System.out.println("Sub:methodB()");
	}
	*/
}

public class Sample2_2 {
	public static void main(String[] args) {
		Sub2 obj = new Sub2();
		obj.methodA();
		obj.methodB();
	}
}
