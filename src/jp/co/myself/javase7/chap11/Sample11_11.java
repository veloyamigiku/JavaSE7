package jp.co.myself.javase7.chap11;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Sample11_11 {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		Thread thread = new Thread(new ThreadA10(list));
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.add("E");
		System.out.println("mainTh : add()");
		list.remove(2);
		System.out.println("mainTh : remove()");
	}
}

class ThreadA10 implements Runnable {
	private CopyOnWriteArrayList<String> list;
	
	ThreadA10(CopyOnWriteArrayList<String> list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("ThreadA:" + itr.next());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}