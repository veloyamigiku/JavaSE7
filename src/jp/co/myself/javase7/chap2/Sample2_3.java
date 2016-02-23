package jp.co.myself.javase7.chap2;

class Foo {
	public void method(String s, int... a) {
		System.out.println(s + " サイズ:" + a.length);
		for (int i : a) {
			System.out.println("第2引数の値：" + i);
		}
	}
}

public class Sample2_3 {
	public static void main(String[] args) {
		Foo obj = new Foo();
		int[] ary = {10, 20, 30};
		obj.method("第1回目");
		obj.method("第2回目", 10);
		obj.method("第3回目", 10, 20);
		obj.method("第4回目", ary);
		// 可変長引数へのアクセス時に、例外が発生します。
		//obj.method("第5回目", null);
	}
}
