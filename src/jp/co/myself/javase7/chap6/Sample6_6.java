package jp.co.myself.javase7.chap6;

import java.util.LinkedList;
import java.util.Queue;

public class Sample6_6 {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("1"); queue.offer("2"); queue.offer("3");
		System.out.println(queue);
		System.out.println("peek() : " + queue.peek());
		System.out.println(queue);
		System.out.println("poll() : " + queue.poll());
		System.out.println(queue);
	}
}
