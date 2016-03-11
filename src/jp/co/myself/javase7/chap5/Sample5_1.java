package jp.co.myself.javase7.chap5;

public class Sample5_1 {
	
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("tanaka");
		StringBuffer sb2 = new StringBuffer("tanaka");
		if (sb1.equals(sb2)) {
			System.out.println("同じ参照");
		} else {
			System.out.println("異なる参照");
		}
		
		if (sb1 == sb2) {
			System.out.println("同じ参照");
		} else {
			System.out.println("異なる参照");
		}
	}
	
}
