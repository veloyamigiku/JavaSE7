package jp.co.myself.javase7.chap4;

interface MyIF {
	void exe();
}

class A2 implements MyIF {
	
	@Override
	public void exe() {
		
	}
	
}

class B2 implements MyIF {
	
	@Override
	public void exe() {

	}
	
}

class Foo6 {
	void method(String str) {
		MyIF obj = null;
		if (str.equals("A")) {
			obj = new A2();
		} else {
			obj = new B2();
		}
		obj.exe();
	}
}

public class Sample4_8 {
	
	public static void main(String[] args){
		
	}
}
