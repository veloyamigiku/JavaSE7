package jp.co.myself.javase7.chap5;

public class Sample5_2 {
	
	public static void main(String[] args) {
		String i = "100";
		Integer i1 = new Integer(i);
		Integer i2 = Integer.valueOf(i);
		int i3 = Integer.parseInt(i);
		double d1 = i2.doubleValue();
		System.out.println(i1 + " : " + i2 + " : " + i3 + " : " + d1);
	}
	
}
