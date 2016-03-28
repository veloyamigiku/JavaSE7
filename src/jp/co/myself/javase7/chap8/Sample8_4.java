package jp.co.myself.javase7.chap8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample8_4 {
	
	public static void main(String[] args) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ren/8_2.txt"));
				DataInputStream dis = new DataInputStream(new FileInputStream("ren/8_2.txt"))) {
			dos.writeInt(100);
			dos.writeUTF("tanaka");
			dos.writeUTF(" 田中");
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
