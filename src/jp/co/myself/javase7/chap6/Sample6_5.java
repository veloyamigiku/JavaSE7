package jp.co.myself.javase7.chap6;

import java.util.HashSet;
import java.util.Iterator;

public class Sample6_5 {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("AAA"); set.add("BBB"); set.add("CCC");
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
	
}
