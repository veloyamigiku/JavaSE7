package jp.co.myself.javase7;

public class Sample1_7 {
	public static void main(String[] args) {
		
	}
}

class SuperA {}
final class SuperB {}
class SuperC { void print(){} }
class SuperD { final void print(){} }

// 以下のコメント文は、コンパイルエラーになる文です。
class SubA extends SuperA { }
//class SubB extends SuperB { }
class SubC extends SuperC { void print(){} }
//class SubD extends SuperD { void print(){} }
