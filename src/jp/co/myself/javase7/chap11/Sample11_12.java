package jp.co.myself.javase7.chap11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample11_12 {
	public static void main(String[] args) {
		//ExecutorService ex = Executors.newSingleThreadExecutor();
		ExecutorService ex = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 3; i++) {
			ex.execute(new ThreadA11());
		}
		ex.shutdown();
		System.out.println("ex.shutdown()");
	}
}

class ThreadA11 implements Runnable {
	public ThreadA11() {
		System.out.println("ThreadA()");
	}
	
	@Override
	public void run() {
		System.out.println("[" + Thread.currentThread().getName() + "]");
		for (int i = 0; i < 2; i++) {
			System.out.println("* ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}