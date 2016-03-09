package jp.co.myself.javase7.chap4;

class Foo {
	public static int methodA(Bar b) {
		return b.methodC() * 2;
	}
}

class Bar {
	int num = 100;
	public void methodB() {
		num = Foo.methodA(this);
	}
	public int methodC() {
		return num;
	}
}

public class Sample4_1 {
	
	public static void main(String[] args) {
		Bar bar = new Bar();
		bar.methodB();
		System.out.println(bar.methodC());
	}
	
}
