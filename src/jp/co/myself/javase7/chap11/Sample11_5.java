package jp.co.myself.javase7.chap11;

public class Sample11_5 {
	public static void main(String[] args) {
		ThreadA5 a = new ThreadA5();
		a.start();
		System.out.println("main : sleep開始");
		try {
			Thread.sleep(2000);
			System.out.println("main : sleep終了");
			a.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

class ThreadA5 extends Thread {
	
	@Override
	public void run() {
		System.out.println("ThreadA : sleep開始");
		try {
			Thread.sleep(5000);
			System.out.println("ThreadA : sleep終了");
		} catch (InterruptedException e) {
			System.out.println("ThreadA : 割り込みをキャッチしました");
		}
		System.out.println("ThreadA : 処理再開");		
	}
	
}