package jp.co.myself.javase7.chap4;

interface MyIF2 {
	void exe();
}

class A3 implements MyIF2 {
	
	@Override
	public void exe() {
	}
	
}

class B3 implements MyIF2 {
	
	@Override
	public void exe() {
	}
	
}

class Factory {
	static MyIF2 getInstance(String str) {
		MyIF2 obj = null;
		if (str.equals("A")) {
			obj = new A3();
		} else {
			obj = new B3();
		}
		return obj;
	}
}

class Foo7 {
	void method(String str) {
		MyIF2 obj = Factory.getInstance(str);
		obj.exe();
	}
}

public class Sample4_9 {
	public static void main(String[] args) {
		
	}
}
