package jp.co.myself.javase7;

class Foo4 {
	
}

class Bar {

	@Override
	public String toString() {
		return "This is an object made from Bar.";
	}
	
}
public class Sample1_14 {
	
	public static void main(String[] args) {
		String obj1 = "test";
		Foo4 obj2 = new Foo4();
		Bar obj3 = new Bar();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
