package jp.co.myself.javase7.chap6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample6_12 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10,  "A");
		List<String> list1 = new ArrayList<>();
		list1.add("B");
		methodA(new ArrayList<String>());
		ArrayList<String> list2 = methodB();
	}
	
	static void methodA(ArrayList<String> list) {
		System.out.println("methodA()");
	}
	
	static ArrayList<String> methodB() {
		System.out.println("methodB()");
		return new ArrayList<>();
	}
}
