package jp.co.myself.javase7.chap3;

interface MyInter {
	void methodA();
}

abstract class Super {
	abstract void methodB();
}

class Outer5 {
	
	class SubA implements MyInter {
		
		@Override
		public void methodA() {
			System.out.println("SubA : methodA()");
		}
		
	}
	
	class SubB extends Super {
		
		@Override
		void methodB() {
			System.out.println("SubB : methodB()");
		}
		
	}
	
}

public class Sample3_5 {
	
	public static void main(String[] args) {
		MyInter subA = new Outer5().new SubA();
		subA.methodA();
		Super subB = new Outer5().new SubB();
		subB.methodB();
	}
	
}
