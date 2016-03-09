package jp.co.myself.javase7.chap4;

class Foo2 {
	public static int methodA(int b) {
		return b * 2;
	}
}

class Bar2 {
	int num = 10;
	public void methodB() {
		num = Foo2.methodA(num);
	}
	public int methodC() {
		return num;
	}
}

public class Sample4_2 {
	
	public static void main(String[] args) {
		Bar2 bar = new Bar2();
		bar.methodB();
		System.out.println(bar.methodC());
	}
	
	
}
