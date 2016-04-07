package jp.co.myself.javase7.chap11;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Sample11_9 {
	
	public static void main(String[] args) {
		BlockingQueue<String> queue = new SynchronousQueue<String>();
		new Thread(new Sample11_9().new ThreadA(queue)).start();
		new Thread(new Sample11_9().new ThreadB(queue)).start();
	}
	
	class ThreadA implements Runnable {
		BlockingQueue<String> queue;
		
		public ThreadA(BlockingQueue<String> queue) {
			this.queue = queue;
		}
		
		@Override
		public void run() {
			int count = 0;
			while (true) {
				System.out.println("put:" + ++count);
				try {
					this.queue.put("A - " + count);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	class ThreadB implements Runnable {
		BlockingQueue<String> queue;
		
		public ThreadB(BlockingQueue<String> queue) {
			this.queue = queue;
		}
		
		@Override
		public void run() {
			while (true) {
				try {
					String str = this.queue.take();
					System.out.println("take:" + str);
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
