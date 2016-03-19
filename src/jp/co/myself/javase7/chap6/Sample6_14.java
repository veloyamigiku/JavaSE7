package jp.co.myself.javase7.chap6;

class Gen2 {
	private String var1 = "aaa";
	public <T> T method(T value) {
		return value;
	}
	public String getVar1() {
		return var1;
	}
}

public class Sample6_14 {
	public static void main(String[] args) {
		Gen2 g = new Gen2();
		Integer i = g.method(1);
		System.out.println(i);
		String s1 = g.method("ABC");
		String s2 = g.<String>method("abc");
		System.out.println(s1 + " " + s2);
	}
}
