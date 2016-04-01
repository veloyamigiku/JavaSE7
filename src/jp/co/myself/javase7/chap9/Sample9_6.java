package jp.co.myself.javase7.chap9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_6 {
	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("C:\\sample\\chap09\\ren\\9_6.txt");
		
		Object obj1 = Files.getAttribute(p1, "creationTime");
		Object obj2 = Files.getAttribute(p1, "lastModifiedTime");
		Object obj3 = Files.getAttribute(p1, "size");
		System.out.printf("creationTime : %s\n", obj1);
		System.out.printf("lastModifiedTime : %s\n", obj2);
		System.out.printf("size : %s\n", obj3);
	}
}
