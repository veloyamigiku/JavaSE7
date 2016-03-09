package jp.co.myself.javase7.chap3;

interface MyInter2 {
	void methodA();
}

class Outer7 {
	void method() {
		new MyInter2() {
			@Override
			public void methodA() {
				System.out.println("methodA()");
			}
		}.methodA();
	}
}

public class Sample3_7 {
	
	public static void main(String[] args) {
		new Outer7().method();
	}
	
}
