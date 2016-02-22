package jp.co.myself.javase7.chap2;

class Super {
	public void print(String s) {
		System.out.println("Super print:" + s);
	}
	public void method() {
		
	}
}

class Sub extends Super {
	public void print(String s) {
		s = "渡された文字列は[" + s + "]です";
		System.out.println("Sub print:" + s);
	}
	// 下記のオーバーライドは、公開範囲が狭くなるためコンパイルエラーになります。
	//void method() {}
}
public class Sample2_1 {
	
	public static void main(String[] args) {
		Super s1 = new Super();
		s1.print("Java");
		Sub s2 = new Sub();
		s2.print("Java");
	}
}
