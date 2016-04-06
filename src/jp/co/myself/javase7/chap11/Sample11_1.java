package jp.co.myself.javase7.chap11;

public class Sample11_1 {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		b.start();
	}
}

class ThreadA extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("A:" + i + " ");
		}
	}
	
}

class ThreadB extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("B:" + i + " ");
		}
	}
	
}
