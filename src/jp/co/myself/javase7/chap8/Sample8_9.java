package jp.co.myself.javase7.chap8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Foo implements Serializable {
	Foo() {
		System.out.println("Foo()");
	}
}

class Bar extends Foo {
	Bar() {
		System.out.println("Bar()");
	}
}

public class Sample8_9 {
	public static void main(String[] args) {
		Bar obj = new Bar();
		System.out.println("----- インスタンス化完了");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ren/8_2.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ren/8_2.txt"))) {
			oos.writeObject(obj);
			System.out.println("----- シリアライズ完了");
			Bar readObj = (Bar) ois.readObject();
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
