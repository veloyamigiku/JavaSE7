package jp.co.myself.javase7.chap5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample5_16 {
	
	public static void main(String[] args) {
		String reg = "9+";
		String data = "abc9999de99ghi";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(data);
		while (matcher.find()) {
			System.out.println("group():" + matcher.group());
			System.out.println("start():" + matcher.start());
			System.out.println("end():" + matcher.end());
		}
	}
	
}
