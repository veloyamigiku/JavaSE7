package jp.co.myself.javase7.chap2;

class Super3 {
	int num;
	public void methodA() {
		num += 100;
	}
	public void print() {
		System.out.println("num値:" + num);
	}
}

class Sub3 extends Super3 {
	public void methodA() {
		num += 500;
	}
	public void methodB(int num) {
		methodA();
		print();
		super.methodA();
		print();
	}
}

public class Sample2_6 {
	
	public static void main(String[] args) {
		Sub3 s = new Sub3();
		s.methodB(0);
	}
}
