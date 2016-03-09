package jp.co.myself.javase7.chap4;

class Foo3 {
	private String msg = "Foo";
	public String getMsg() {
		return msg;
	}
}

class Bar3 {
	private String msg = "Bar";
	private Foo3 obj;
	public Bar3() {
		obj = new Foo3();
	}
	public String getMsg() {
		return obj.getMsg() + ":" + msg;
	}
}

public class Sample4_3 {
	
	public static void main(String[] args) {
		Bar3 bar = new Bar3();
		System.out.println(bar.getMsg());
	}
	
}
