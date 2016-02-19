package jp.co.myself.javase7;

public class Sample1_6 {
	
	public static void main(String[] args) {
		// 以下のコメント分は、コンパイルエラーになる文です。
		//float x1 = 3_.1415F;
		//float x2 = 3._1415F;
		//long x3 = 999_99_9999_L;
		//int x4 = _52;
		int x5 = 5_2;
		//int x6 = 52_;
		int x7 = 5______2;
		//int x8 = 0_x52;
		//int x9 = 0x_52;
		int x10 = 0x5_2;
		int x11 = 0_52;
	}
}
