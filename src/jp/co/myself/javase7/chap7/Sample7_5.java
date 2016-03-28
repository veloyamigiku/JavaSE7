package jp.co.myself.javase7.chap7;

import java.io.IOException;

public class Sample7_5 {
	
	public static void main(String[] args) {
		try {
			methodA();
			methodB();
		} catch (ArrayStoreException | IOException e) {
			System.out.println(e);
		}
	}
	
	private static void methodA() throws ArrayStoreException {
		throw new ArrayStoreException();
	}
	
	private static void methodB() throws IOException {
		throw new IOException();
	}
}
