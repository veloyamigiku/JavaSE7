package jp.co.myself.javase7.chap4;

public class Sample4_5 {
	
	public static void main(String[] args) {
		MySingleton obj1 = MySingleton.getInstance();
		MySingleton obj2 = MySingleton.getInstance();
		if (obj1 == obj2) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
	}
	
}
