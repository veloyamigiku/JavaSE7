package jp.co.myself.javase7.chap8;

import java.util.Scanner;

public class Sample8_17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (scn.hasNextDouble()) {
			System.out.println("入力した値:" + scn.nextDouble());
		}
	}
}
