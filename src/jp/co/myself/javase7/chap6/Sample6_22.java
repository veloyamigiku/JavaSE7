package jp.co.myself.javase7.chap6;

import java.util.Arrays;
import java.util.List;

public class Sample6_22 {
	public static void main(String[] args) {
		String[] ary = {"A", "B", "C"};
		List<String> list = Arrays.asList(ary);
		list.set(2, "D");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
