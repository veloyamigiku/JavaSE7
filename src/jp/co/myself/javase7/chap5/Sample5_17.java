package jp.co.myself.javase7.chap5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample5_17 {
	
	public static void main(String[] args) {
		String data = "The dog says meow. ALl dogs say meow.";
		Pattern pattern = Pattern.compile("dog");
		Matcher matcher = pattern.matcher(data);
		System.out.println(matcher.replaceAll("cat"));
		System.out.println(data.replaceAll("dog", "cat"));
		System.out.println(data.replace("dog", "cat"));
	}
	
}
