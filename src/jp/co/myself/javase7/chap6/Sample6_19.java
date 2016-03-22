package jp.co.myself.javase7.chap6;

import java.util.PriorityQueue;
import java.util.Queue;

public class Sample6_19 {
	public static void main(String[] args) {
		Queue<String> pg = new PriorityQueue<String>();
		pg.add("C");
		pg.add("A");
		pg.add("B");
		pg.add("C");
		pg.add("D");
		System.out.println(pg);
		System.out.println(pg.poll());
		System.out.println(pg);
		System.out.println(pg.poll());
		System.out.println(pg);
		System.out.println(pg.peek());
		System.out.println(pg);
	}
}
