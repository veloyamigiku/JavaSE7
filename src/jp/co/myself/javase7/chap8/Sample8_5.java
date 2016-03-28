package jp.co.myself.javase7.chap8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample8_5 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter(new File("ren/8_2.txt"));
				FileReader fr = new FileReader(new File("ren/8_2.txt"))) {
			fw.write(" 田中");
			fw.flush();
			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
