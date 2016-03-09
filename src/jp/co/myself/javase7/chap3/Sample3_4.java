package jp.co.myself.javase7.chap3;

class Outer4 {
	public int num = 100;
	class A {
		public int num = 200;
		void method(int num) {
			System.out.println("num : " + num);
			System.out.println("this.num : " + this.num);
			System.out.println("Outer.this.num : " + Outer4.this.num);
		}
	}
}

public class Sample3_4 {
	
	public static void main(String[] args) {
		Outer4.A obj = new Outer4().new A();
		obj.method(300);
	}
	
}
