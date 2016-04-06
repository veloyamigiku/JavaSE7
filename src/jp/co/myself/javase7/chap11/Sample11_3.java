package jp.co.myself.javase7.chap11;

public class Sample11_3 {
	public static void main(String[] args) {
		Thread mainTh = Thread.currentThread();
		System.out.println("mainTh Priority:" + mainTh.getPriority());
		ThreadA3 aTh = new ThreadA3();
		aTh.setPriority(Thread.MAX_PRIORITY);
		System.out.println("aTh Priority:" + aTh.getPriority());
		aTh.start();
	}
}

class ThreadA3 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("A:" + i + " ");
		}
	}
	
}