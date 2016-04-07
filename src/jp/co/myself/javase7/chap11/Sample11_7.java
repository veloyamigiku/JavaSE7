package jp.co.myself.javase7.chap11;

public class Sample11_7 {
	
	public static void main(String[] args) {
		Share2 share = new Share2();
		ThreadA7 threadA = new ThreadA7(share);
		ThreadB7 threadB = new ThreadB7(share);
		threadA.start();
		threadB.start();
		
	}
}

class Share2 {
	private int a = 0;
	private String b;
	public synchronized void set() {
		a++;
		b = "data";
		System.out.println("set() a:" + a + " b:" + b);
	}
	public synchronized void print() {
		a--;
		b = null;
		System.out.println("print() a:" + a + " b:" + b);
	}
}

class ThreadA7 extends Thread {
	private Share2 share;
	
	public ThreadA7(Share2 share) {
		this.share = share;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			share.set();
		}
	}
	
}

class ThreadB7 extends Thread {
	private Share2 share;
	
	public ThreadB7(Share2 share) {
		this.share = share;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			share.print();
		}
	}
	
}
