package jp.co.myself.javase7.chap1;

public class Sample1_5 {
	
	public static void main(String[] args) {
		// 10進数の値を変数に格納します。
		int val1 = 26;
		// 8進数の値を変数に格納します。
		int val2 = 032;
		// 16進数の値を変数に格納します。
		int val3 = 0x1a;
		// 2進数の値を変数に格納します。
		int val4 = 0b11010;
		// 2進数の値を変数に格納するエラーパターンです。
		//int val5 = 0b1201;
		
		System.out.println("val1:" + val1);
		System.out.println("val2:" + val2);
		System.out.println("val3:" + val3);
		System.out.println("val4:" + val4);
	}
	
}
