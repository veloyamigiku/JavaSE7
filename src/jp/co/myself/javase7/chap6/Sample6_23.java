package jp.co.myself.javase7.chap6;

import java.util.Arrays;
import java.util.Comparator;

class MyReverseSorter implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}

public class Sample6_23 {
	public static void main(String[] args) {
		String[] str = {"Naoki", "Satoshi", "Chieko"};
		System.out.println("ソートなし");
		for (String s : str) {
			System.out.print(s + " ");
		}
		System.out.println("\nChieko = " +
				Arrays.binarySearch(str, "Chieko"));
		Arrays.sort(str);
		System.out.println("自然順にソート：");
		for (String s : str) {
			System.out.print(s + " ");
		}
		System.out.println("\nChieko = " +
				Arrays.binarySearch(str, "Chieko"));
		System.out.print("Comparatorを使用して逆順にソート");
		Arrays.sort(str, new MyReverseSorter());
		for (String s : str) {
			System.out.print(s + " ");
		}
		System.out.println("\nChieko = " +
				Arrays.binarySearch(str, "Chieko", new MyReverseSorter()));
		
	}
}
