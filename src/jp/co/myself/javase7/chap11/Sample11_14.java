package jp.co.myself.javase7.chap11;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample11_14 {
	public static void main(String[] args) {
		ExecutorService ex = Executors.newSingleThreadExecutor();
		System.out.println("Start : " + new Date());
		Future<Date> future = ex.submit(new ThreadA13());
		try {
			Date date = future.get();
			System.out.println("End : " + date);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		ex.shutdown();
	}
}

class ThreadA13 implements Callable<Date> {
	
	@Override
	public Date call() throws Exception {
		Thread.sleep(3000);
		return new Date();
	}
	
}