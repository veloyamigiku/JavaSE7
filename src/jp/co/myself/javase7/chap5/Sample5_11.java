package jp.co.myself.javase7.chap5;

import java.text.NumberFormat;
import java.util.Locale;

public class Sample5_11 {
	
	public static void main(String[] args) {
		NumberFormat jpNum = NumberFormat.getInstance();
		NumberFormat jpCur = NumberFormat.getCurrencyInstance();
		System.out.println("日本の数値:" + jpNum.format(50000));
		System.out.println("日本の通貨:" + jpCur.format(50000));
		jpNum.setMaximumIntegerDigits(5);
		System.out.println("5桁以下:" + jpNum.format(12345678));
		jpNum.setMinimumIntegerDigits(3);
		System.out.println("3桁以上:" + jpNum.format(1));
		
		NumberFormat usNum = NumberFormat.getInstance(Locale.US);
		NumberFormat usCur = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("米国の数値:" + usNum.format(50000));
		System.out.println("米国の通貨:" + usCur.format(50000));
	}
	
}
