package jp.co.myself.javase7.chap4;

public class MySingleton {
	
	private static final MySingleton instance = new MySingleton();
	private MySingleton() {
		
	}
	public static MySingleton getInstance() {
		return instance;
	}
}
