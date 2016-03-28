package jp.co.myself.javase7.chap8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample8_3 {
	
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream(new File("ren/8_2.txt"));
				FileInputStream fis = new FileInputStream(new File("ren/8_2.txt"))) {
			fos.write(0);
			fos.write("suzuki".getBytes());
			fos.write(99);
			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.print(data + " ");
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありません。");
		} catch (IOException e) {
			System.out.println("IO Error");
		}
	}
	
}
