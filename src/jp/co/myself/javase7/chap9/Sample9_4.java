package jp.co.myself.javase7.chap9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_4 {
	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("ren");
		Path p2 = Paths.get("C:\\sample\\chap09\\ren");
		System.out.printf("exists: %s\n", Files.exists(p1));
		System.out.printf("isSameFile: %s\n", Files.isSameFile(p1, p2));
		System.out.printf("isDirectory: %s\n", Files.isDirectory(p1));
		System.out.printf("isRegularFile: %s\n", Files.isRegularFile(p1));
		System.out.printf("isReadable: %s\n", Files.isReadable(p1));
		System.out.printf("isExecutable: %s\n", Files.isExecutable(p1));
	}
}
