package jp.co.myself.javase7.chap3;

class Outer3 {
	void methodOuterA() {
		new A().methodA();
	}
	
	void methodOuterB() {
		new B().methodB();
	}
	
	class A {
		void methodA() {
			System.out.println("methodA()");
		}
	}
	
	static class B {
		static void methodB() {
			System.out.println("methodB()");
		}
	}
}

public class Sample3_3 {
	
	public static void main(String[] args) {
		Outer3 o = new Outer3();
		o.methodOuterA();
		o.methodOuterB();
	}
	
}
