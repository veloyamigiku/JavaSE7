package jp.co.myself.javase7.chap9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Sample9_7 {
	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("C:\\sample\\chap09\\ren\\9_7.txt");
		
		BasicFileAttributes attr = Files.readAttributes(p1, BasicFileAttributes.class);
		System.out.printf("creationTime : %s\n", attr.creationTime());
		System.out.printf("lastModifiedTime : %s\n", attr.lastModifiedTime());
		System.out.printf("size : %s\n", attr.size());
	}
}
