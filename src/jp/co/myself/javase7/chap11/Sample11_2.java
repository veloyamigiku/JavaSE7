package jp.co.myself.javase7.chap11;

public class Sample11_2 {
	public static void main(String[] args) {
		ThreadA2 threadA = new ThreadA2();
		ThreadB2 threadB = new ThreadB2();
		Thread a = new Thread(threadA);
		Thread b = new Thread(threadB);
		a.start();
		b.start();
	}
}

class ThreadA2 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("A:" + i + " ");
		}
	}
	
}

class ThreadB2 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("B:" + i + " ");
		}
	}
	
}