package jp.co.myself.javase7.chap9;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_2 {
	public static void main(String[] args) {
		Path path1 = Paths.get("./ren");
		System.out.printf("toString: %s\n", path1.toString());
		System.out.printf("normalize: %s\n", path1.normalize());
		System.out.printf("toUri: %s\n", path1.toUri());
		System.out.printf("toAbsolutePath: %s\n", path1.toAbsolutePath());
		Path path2 = null;
		try {
			path2 = path1.toRealPath();
			System.out.printf("toRealPath(): %s\n", path2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("resolve: %s\n", path1.resolve("bar"));
		System.out.printf("resolve: %s\n", path2.resolve("bar"));
	}
}
