package jp.co.myself.javase7.chap5;

import java.text.DecimalFormat;

public class Sample5_12 {
	
	public static void main(String[] args) {
		customFormat("###,###.###", 123456.789);
		customFormat("###.##", 123456.789);
		customFormat("000000.000", 123.78);
		customFormat("$###,###.###", 12345.67);
		customFormat("\u00a5###,###.###", 12345.67);
	}
	
	private static void customFormat(String pattern, double value) {
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String fData = myFormatter.format(value);
		System.out.println(fData);
	}
	
}
