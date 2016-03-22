package jp.co.myself.javase7.chap6;

import java.util.HashSet;
import java.util.TreeSet;

public class Sample6_18 {
	
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("D");
		hash.add("B");
		hash.add("C");
		System.out.println("HashSet : " + hash);
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("D");
		tree.add("B");
		tree.add("C");
		System.out.println("TreeSet : " + tree);
	}
	
}
