package jp.co.myself.javase7.chap6;

import java.util.ArrayList;
import java.util.List;

class X {
	public String toString() {
		return "X";
	}
}

class Y extends X {
	public String toString() {
		return "Y";
	}
}

public class Sample6_17 {
	
	public static void method1(List<? extends X> list) {
		System.out.println(list.get(0) + " ");
	}
	
	public static void method2(List<? super Y> list) {
		// ワイルドカードを利用したジェネリクスの場合は、実行時まで型が不明なため、以下の追加等は出来ないが
		// superで型タイプと同じ場合は追加可能。
		list.add(new Y());
		System.out.println(list.get(0) + " ");
	}
	
	public static void main(String[] args) {
		List<X> l1 = new ArrayList<X>();
		l1.add(new X());
		List<Y> l2 = new ArrayList<Y>();
		l2.add(new Y());
		
		method1(l1);
		method1(l2);
		
		method2(l1);
		method2(l2);
	}
}
