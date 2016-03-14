package jp.co.myself.javase7.chap5;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Sample5_13 {
	
	public static void main(String[] args) {
		Date today = new Date();
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.US);
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.US);
		System.out.println("getDateInstance() : " + df1.format(today));
		System.out.println("getTimeInstance() : " + df2.format(today));
		System.out.println("getDateTimeInstance() : " + df3.format(today));
		try {
			System.out.println("parse() : " + df1.parse("Aug 8, 2013"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
