package jp.co.myself.javase7.chap1;

class Foo6 {
	
}

public class Sampel1_16 {
	public static void main(String[] args) {
		Foo6 f1 = new Foo6();
		Foo6 f2 = new Foo6();
		System.out.println("f1.equals(f2):" + f1.equals(f2));
		
		Foo6 f3 = new Foo6();
		Foo6 f4 = f3;
		System.out.println("f3.equals(f4):" + f3.equals(f4));
	}
}
