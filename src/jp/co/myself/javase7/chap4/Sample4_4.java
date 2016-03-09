package jp.co.myself.javase7.chap4;

class Foo4 {
	private String msg = "Foo";
	public String getMsg() {
		return msg;
	}
}

class Bar4 extends Foo4 {
	private String msg = "Bar";
	public Bar4() {
		
	}
	public String getMsg() {
		return super.getMsg() + ":" + msg;
	}
}

public class Sample4_4 {
	
	public static void main(String[] args) {
		Bar4 bar = new Bar4();
		System.out.println(bar.getMsg());
	}
	
}
