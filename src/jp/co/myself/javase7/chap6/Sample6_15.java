package jp.co.myself.javase7.chap6;

interface MyIn<T> {
	void method(T t);
}

class Foo3 implements MyIn<String> {
	
	@Override
	public void method(String s) {
		System.out.println(s);
	}
	
}

class Bar implements MyIn<Integer> {
	
	@Override
	public void method(Integer i) {
		System.out.println(i);
	}
	
}

public class Sample6_15 {
	public static void main(String[] args) {
		Foo3 f = new Foo3();
		f.method("ABC");
		Bar b = new Bar();
		b.method(10);
	}
}
