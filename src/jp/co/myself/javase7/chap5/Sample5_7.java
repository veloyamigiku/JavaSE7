package jp.co.myself.javase7.chap5;

import java.util.Locale;
import java.util.ResourceBundle;

public class Sample5_7 {
	
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		ResourceBundle obj = ResourceBundle.getBundle(MyResources2.class.getName(), locale);
		Long data1 = (Long) obj.getObject("data1");
		Integer data2 = (Integer) obj.getObject("data2");
		int[] data3 = (int[]) obj.getObject("data3");
		System.out.println("data1:" + data1);
		System.out.println("data2:" + data2);
		System.out.print("data3:");
		for (int i : data3) {
			System.out.print(i + " ");
		}
	}
	
}
