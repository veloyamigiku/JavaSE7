package jp.co.myself.javase7.chap6;

import java.util.Arrays;

public class Sample6_21 {
	
	public static void main(String[] args) {
		int[] intAry = {3, 1, 2};
		print(intAry);
		Arrays.sort(intAry);
		print(intAry);
		Object[] objectAry2 = {
				new String("aa"),
				new Integer(1)
		};
		// 以下は実行時エラーが発生します。
		//Arrays.sort(objectAry2);
	}
	
	public static void print(int[] intAry) {
		for (int num : intAry) {
			System.out.println(num);
		}
	}
}
