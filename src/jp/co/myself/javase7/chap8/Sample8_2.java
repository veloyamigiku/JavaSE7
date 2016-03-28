package jp.co.myself.javase7.chap8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample8_2 {
	
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream(new File("ren/8_2.txt"));
			fos.write(0);
			fos.write("suzuki".getBytes());
			fos.write(99);
			fis = new FileInputStream(new File("ren/8_2.txt"));
			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.print(data + " ");
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありません。");
		} catch (IOException e) {
			System.out.println("IO Error");
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {}
		}
	}
}
