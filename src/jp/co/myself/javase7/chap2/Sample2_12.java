package jp.co.myself.javase7.chap2;

class Super5 {
	static String x = "Super : x";
	String y = "Super : y";
	static void methodA() {
		System.out.println("Super : methodA()");
	}
	void methodB() {
		System.out.println("Super : methodB()");
	}
}

class Sub5 extends Super5 {
	static String x = "Sub : x";
	String y = "Sub : y";
	static void methodA() {
		System.out.println("Sub : methodA()");
	}
	void methodB() {
		System.out.println("Sub : methodB()");
	}
}

public class Sample2_12 {
	
	public static void main(String[] args) {
		Super5 obj = new Sub5();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.methodA();
		obj.methodB();
	}
	
}
