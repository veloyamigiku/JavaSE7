package jp.co.myself.javase7.chap3;

interface MyInter3 {
	void methodA();
}

class Outer8 {
	void method() {
		MyInter3 obj = new MyInter3() {
			@Override
			public void methodA() {
				System.out.println("methodA()");
			}
		};
		obj.methodA();
	}
}

public class Sample3_8 {
	
	public static void main(String[] args) {
		new Outer8().method();
	}
	
}
