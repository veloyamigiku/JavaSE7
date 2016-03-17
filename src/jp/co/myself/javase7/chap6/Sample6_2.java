package jp.co.myself.javase7.chap6;

import java.util.HashSet;

public class Sample6_2 {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		String[] ary = {"AAA", "BBB", "CCC"};
		set.add(ary[0]);
		set.add(ary[1]);
		set.add(ary[2]);
		set.add(ary[0]);
		System.out.println("size : " + set.size());
		for (String s : set) {
			System.out.println(s + " ");
		}
	}
}
