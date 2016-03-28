package jp.co.myself.javase7.chap8;

import java.io.File;

public class Sample8_1 {
	
	public static void main(String[] args) {
		File f1 = new File("rem/tmp");
		File f2 = new File("ren", "a.txt");
		File f3 = new File(f1, "b.txt");
		System.out.println("path for f1: " + f1.getAbsolutePath());
		System.out.println("path for f2: " + f2.getAbsolutePath());
		System.out.println("path for f3: " + f3.getAbsolutePath());
		System.out.println("使用しているパスの区切り文字: " + System.getProperty("file.separator"));
	}
}
