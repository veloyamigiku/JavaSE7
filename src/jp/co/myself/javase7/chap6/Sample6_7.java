package jp.co.myself.javase7.chap6;

import java.util.LinkedList;
import java.util.Queue;

public class Sample6_7 {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("1"); queue.offer("2");
		for (int i = 0; i < 2; i++) {
			System.out.print(queue.poll() + " ");
		}
		System.out.println(queue.peek());
	}
}
