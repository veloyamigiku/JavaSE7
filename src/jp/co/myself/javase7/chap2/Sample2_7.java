package jp.co.myself.javase7.chap2;

abstract class X {
	protected abstract void methodA();
}

abstract class Y extends X {
}

class Z extends Y {
	
	@Override
	protected void methodA() {}
	// public修飾子でも定義可能です。
	//public void methodA() {}
	// デフォルト修飾子では定義不可です。
	//void methodA() {}
	
}

public class Sample2_7 {
	
	public static void main(String[] args) {
		
	}
	
}
