package jp.co.myself.javase7.chap4;

class A {
	public void exec() {
		
	}
}

class B {
	public void exec() {
		
	}
}

class Foo5 {
	void method(String str) {
		if (str.equals("A")) {
			A obj = new A();
			obj.exec();
		} else {
			B obj = new B();
			obj.exec();
		}
	}
}

public class Sample4_7 {
	public static void main(String[] args) {
		
	}
}
