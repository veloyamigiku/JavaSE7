package jp.co.myself.javase7.chap5;

import java.util.Locale;

public class Sample5_5 {
	
	public static void main(String[] args) {
		Locale japan = Locale.getDefault();
		System.out.println(japan.getDisplayCountry() + " : " + japan.getDisplayLanguage());
		System.out.println("----------");
		Locale us = new Locale("en", "US");
		System.out.println(us.getDisplayCountry() + " : " +
				us.getDisplayLanguage());
		System.out.println(us.getDisplayCountry(us) + " : " +
				us.getDisplayLanguage(us));
		System.out.println(us.getCountry() + " : " +
				us.getLanguage());
		
	}
	
}
