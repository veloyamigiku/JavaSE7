package jp.co.myself.javase7.chap6;

import java.util.ArrayList;

public class Sample6_11 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Integer i1 = new Integer(1);
		int i2 = 2;
		Integer i3 = i1;
		list.add(i1);
		list.add(i2);
		list.add(i3);
		System.out.println("size : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			Integer obj = (Integer) list.get(i);
			System.out.print(obj + " ");
		}
	}
}
