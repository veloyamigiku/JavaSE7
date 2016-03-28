package jp.co.myself.javase7.chap8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Foo2 {
	Foo2() {
		System.out.println("Foo()");
	}
}

class Bar2 extends Foo2 implements Serializable {
	Bar2() {
		System.out.println("Bar()");
	}
}

public class Sample8_10 {
	public static void main(String[] args) {
		Bar2 obj = new Bar2();
		System.out.println("----- インスタンス化完了");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ren/8_2.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ren/8_2.txt"))) {
			oos.writeObject(obj);
			System.out.println("----- シリアライズ完了");
			Bar2 readObj = (Bar2) ois.readObject();
			System.out.println("----- デシリアライズ完了");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
