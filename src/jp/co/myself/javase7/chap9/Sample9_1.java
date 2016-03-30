package jp.co.myself.javase7.chap9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_1 {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\sample\\chap09\\ren\\9_1.txt");
		//Path path = Paths.get("/sample/chap09/ren/9_1.txt");
		System.out.printf("toString: %s\n", path.toString());
		System.out.printf("getFileName: %s\n", path.getFileName());
		System.out.printf("getName(0): %s\n", path.getName(0));
		System.out.printf("getNameCount: %s\n", path.getNameCount());
		System.out.printf("subpath(0, 2): %s\n", path.subpath(0, 2));
		System.out.printf("getParent: %s\n", path.getParent());
		System.out.printf("getRoot: %s\n", path.getRoot());
	}
}
