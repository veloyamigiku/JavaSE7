package jp.co.myself.javase7.chap5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample5_15 {
	
	public static void main(String[] args) {
		String[] word = {
				"Java言語",
				"Java Hello",
				"123Java456",
				"XXJavaYYYJavaZZZ"};
		Pattern pattern = Pattern.compile("^Java(.*)");
		for (int i = 0; i < word.length; i++) {
			Matcher matcher = pattern.matcher(word[i]);
			if (matcher.matches()) {
				System.out.println(matcher.group());
			}
		}
		String str = "a1b2cc3d4";
		String[] token = str.split("\\d");
		for (int i = 0; i < token.length; i++) {
			System.out.println("[" + i + "]" + token[i] + " ");
		}
	}
}
