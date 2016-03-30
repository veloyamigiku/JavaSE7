package jp.co.myself.javase7.chap8;

import java.util.Formatter;

public class Sample8_13 {
	
	public static void main(String[] args) {
		String compName = "SE社";
		String name = "tanaka";
		int age = 20;
		Formatter fm = new Formatter();
		fm.format("会社名は%sです。\n", compName);
		fm.format("名前:%2$s : 年齢:%1$d\n", age, name);
		System.out.println(fm);
		System.out.format("会社名は%sです。\n", compName);
		System.out.format("名前:%2$s : 年齢:%1$d\n", age, name);
	}
	
}
