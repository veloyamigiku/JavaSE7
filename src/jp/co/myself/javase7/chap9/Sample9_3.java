package jp.co.myself.javase7.chap9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_3 {
	public static void main(String[] args) {
		Path p1 = Paths.get("X");
		Path p2 = Paths.get("Y");
		System.out.println("X -> Y相対パス:" + p1.relativize(p2));
		System.out.println("Y -> X相対パス:" + p2.relativize(p1));
	}
}
