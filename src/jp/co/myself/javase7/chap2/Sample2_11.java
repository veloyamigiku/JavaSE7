package jp.co.myself.javase7.chap2;

interface XIF {
	void methodA();
}

interface YIF {
	void methodB();
}

interface SubIF extends XIF, YIF {
	void methodC();
}

class MyClass implements SubIF {

	@Override
	public void methodA() {
		System.out.println("methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("methodB()");
	}

	@Override
	public void methodC() {
		System.out.println("methodC()");
	}
	
}

public class Sample2_11 {
	
	public static void main(String[] args) {
		MyClass c = new MyClass();
		c.methodA(); c.methodB(); c.methodC();
	}
	
}
