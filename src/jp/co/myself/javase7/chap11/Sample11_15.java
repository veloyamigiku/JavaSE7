package jp.co.myself.javase7.chap11;

import java.util.concurrent.atomic.AtomicInteger;

public class Sample11_15 {
	private final AtomicInteger num1 = new AtomicInteger();
	
	class Runnable1 implements Runnable {
		
		@Override
		public void run() {
			for (int i = 0; i < 100000; i++) {
				num1.incrementAndGet();
			}
		}
		
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			Thread obj = new Thread(new Sample11_15().new Runnable1());
		}
	}
}
