package jp.co.myself.javase7.chap11;

public class Sample11_8 {
	
	public static void main(String[] args) {
		Share3 share = new Share3();
		ThreadA8 threadA = new ThreadA8(share);
		ThreadB8 threadB = new ThreadB8(share);
		threadA.start();
		threadB.start();
		
	}
}

class Share3 {
	private int a = 0;
	private String b;
	public synchronized void set() {
		while (a != 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		notify();
		a++;
		b = "data";
		System.out.println("set() a:" + a + " b:" + b);
	}
	public synchronized void print() {
		while (b == null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		notify();
		a--;
		b = null;
		System.out.println("print() a:" + a + " b:" + b);
	}
}

class ThreadA8 extends Thread {
	private Share3 share;
	
	public ThreadA8(Share3 share) {
		this.share = share;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			share.set();
		}
	}
	
}

class ThreadB8 extends Thread {
	private Share3 share;
	
	public ThreadB8(Share3 share) {
		this.share = share;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			share.print();
		}
	}
	
}
