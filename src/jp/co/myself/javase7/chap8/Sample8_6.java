package jp.co.myself.javase7.chap8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample8_6 {
	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("ren/8_2.txt"));
				BufferedReader br = new BufferedReader(new FileReader("ren/8_2.txt"))) {
			bw.write(" おはよう");
			bw.newLine();
			bw.write(" こんにちは");
			bw.flush();
			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
