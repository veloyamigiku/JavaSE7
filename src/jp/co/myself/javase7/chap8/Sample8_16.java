package jp.co.myself.javase7.chap8;

import java.util.Scanner;

public class Sample8_16 {
	public static void main(String[] args) {
		String str = "a,bb,ccc,dd,e";
		Scanner scn = new Scanner(str);
		scn.useDelimiter(",");
		while (scn.hasNext()) {
			System.out.print(scn.next());
		}
		System.out.println();
		String str2 = "1 2 3 10 20 300";
		Scanner scn2 = new Scanner(str2);
		while (scn2.hasNext()) {
			System.out.print(scn2.nextInt());
		}
	}
}
