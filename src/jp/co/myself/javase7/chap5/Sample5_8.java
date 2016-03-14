package jp.co.myself.javase7.chap5;

import java.util.Locale;
import java.util.ResourceBundle;

public class Sample5_8 {
	
	public static void main(String[] args) {
		Locale japan = Locale.getDefault();
		Locale us = new Locale("en", "US");
		Locale[] locArray = {us};
		for (Locale locale : locArray) {
			ResourceBundle obj1 = ResourceBundle.getBundle(MyResources.class.getSimpleName(), locale);
			System.out.println("send:" + obj1.getString("send"));
			System.out.println("cancel:" + obj1.getString("cancel"));
		}
	}
	
}
