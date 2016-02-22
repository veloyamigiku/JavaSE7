package jp.co.myself.javase7.chap1;

public class Sample1_9 {
	
	int instanceVal;
	static int staticVal;
	
	int methodA() { return instanceVal; }
	int methodB() { return staticVal; }
	// 以下のコメント文は、コンパイルエラーの文です。
	//static int methodC() { return instanceVal; }
	static int methodD() { return staticVal; }
	static int methodE() {
		Sample1_9 obj = new Sample1_9();
		return obj.instanceVal;
	}
	
	public static void main(String[] args) {
		
	}
}
