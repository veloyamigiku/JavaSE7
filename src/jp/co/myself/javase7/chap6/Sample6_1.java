package jp.co.myself.javase7.chap6;

import java.util.ArrayList;

public class Sample6_1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer i1 = new Integer(1);
		int i2 = 2;
		Integer i3 = i1;
		list.add(i1);
		list.add(i2);
		list.add(i3);
		System.out.println("size : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println();
		for (Integer i : list) {
			System.out.println(i + " ");
		}
	}
}
