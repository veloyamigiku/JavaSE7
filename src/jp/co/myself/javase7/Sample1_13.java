package jp.co.myself.javase7;

class Foo3 {
	
}

public class Sample1_13 {
	
	public static void main(String[] args) {
		int[] ary = {1, 2, 3};
		Class obj1 = ary.getClass();
		System.out.println(obj1.getName());
		Foo3 foo = new Foo3();
		Class obj2 = foo.getClass();
		System.out.println(obj2.getName());
	}
	
}
