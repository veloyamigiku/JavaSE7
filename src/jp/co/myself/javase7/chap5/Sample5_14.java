package jp.co.myself.javase7.chap5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Sample5_14 {
	
	public static void main(String[] args) {
		String[] ary = {
				"d.MM.yy",
				"yyyy.MM.dd G 'at' hh:mm:ss z",
				"EEE, MMM, d, ''yy",
				"H:mm",
				"H:mm:ss:SSS",
				"K:mm a,z"};
		for (String pattern : ary) {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
			String fData = sdf.format(new Date());
			System.out.println(fData);
		}
	}
	
	
}
