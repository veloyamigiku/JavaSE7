package jp.co.myself.javase7.chap5;

import java.util.Locale;
import java.util.ResourceBundle;

public class Sample5_10 {
	
	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		ResourceBundle.Control ctl = ResourceBundle.Control.getControl(ResourceBundle.Control.FORMAT_PROPERTIES);
		ResourceBundle obj = ResourceBundle.getBundle("MyResource3", locale, ctl);
		System.out.println("data : " + obj.getString("data"));
	}
	
}
