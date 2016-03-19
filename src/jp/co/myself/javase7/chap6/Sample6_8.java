package jp.co.myself.javase7.chap6;

import java.util.Deque;
import java.util.LinkedList;

public class Sample6_8 {
	public static void main(String[] args) {
		Deque<String> deq = new LinkedList<>();
		deq.offerFirst("1"); deq.offerFirst("2"); deq.offerFirst("3");
		System.out.println(deq);
		System.out.println("peekLast() : " + deq.peekLast());
		System.out.println(deq);
		System.out.println("pollLast() : " + deq.pollLast());
		System.out.println(deq);
	}
}
