package jp.co.myself.javase7.chap11;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample11_10 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		Thread thread = new Thread(new ThreadA9(list));
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

class ThreadA9 implements Runnable {
	private ArrayList<String> list;
	
	ThreadA9(ArrayList<String> list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("ThreadA : " + itr.next());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}