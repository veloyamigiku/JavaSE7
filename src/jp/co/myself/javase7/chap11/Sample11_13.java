package jp.co.myself.javase7.chap11;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sample11_13 {
	public static void main(String[] args) {
		ScheduledExecutorService ex = Executors.newSingleThreadScheduledExecutor();
		long start = System.currentTimeMillis();
		System.out.println("main : " + (System.currentTimeMillis() - start));
		ex.schedule(new ThreadA12(start), 3000, TimeUnit.MILLISECONDS);
		ex.shutdown();
	}
}

class ThreadA12 implements Runnable {
	
	long start;
	
	ThreadA12(long start) {
		this.start = start;
		System.out.println("ThreadA(long start) : " + (System.currentTimeMillis() - start));
	}
	
	@Override
	public void run() {
		System.out.println("Start : " + (System.currentTimeMillis() - start));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End : " + (System.currentTimeMillis() - start));
	}
	
}