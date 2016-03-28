package jp.co.myself.javase7.chap8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample8_7 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("ren/8_2.txt"))) {
			System.out.println(br.readLine());
			br.mark(256);
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			br.reset();
			System.out.println(br.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
