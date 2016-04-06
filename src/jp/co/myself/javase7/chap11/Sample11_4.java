package jp.co.myself.javase7.chap11;

public class Sample11_4 {
	public static void main(String[] args) {
		ThreadA4 a = new ThreadA4();
		a.start();
		try {
			a.join();
			System.out.println("mainスレッド終了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadA4 extends Thread {
	
	@Override
	public void run() {
		ThreadB4 b = new ThreadB4();
		b.start();
		try {
			b.join();
			System.out.println("ThreadAスレッド終了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class ThreadB4 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);
				System.out.print("*");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("ThreadBスレッド終了");
	}
	
}