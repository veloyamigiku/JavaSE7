package jp.co.myself.javase7.chap11;

public class Sample11_6 {
	
	public static void main(String[] args) {
		Share share = new Share();
		ThreadA6 threadA = new ThreadA6(share);
		ThreadB6 threadB = new ThreadB6(share);
		threadA.start();
		threadB.start();
		
	}
}

class Share {
	private int a = 0;
	private String b;
	public void set() {
		a++;
		b = "data";
		System.out.println("set() a:" + a + " b:" + b);
	}
	public void print() {
		a--;
		b = null;
		System.out.println("print() a:" + a + " b:" + b);
	}
}

class ThreadA6 extends Thread {
	private Share share;
	
	public ThreadA6(Share share) {
		this.share = share;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			share.set();
		}
	}
	
}

class ThreadB6 extends Thread {
	private Share share;
	
	public ThreadB6(Share share) {
		this.share = share;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			share.print();
		}
	}
	
}
