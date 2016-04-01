package jp.co.myself.javase7.chap9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class Sample9_8 {
	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("C:\\sample\\chap09\\ren\\9_8.txt");
		
		DosFileAttributes attr = Files.readAttributes(p1, DosFileAttributes.class);
		System.out.printf("isArchive : %s\n", attr.isArchive());
		System.out.printf("isHidden : %s\n",  attr.isHidden());
		System.out.printf("isReadOnly : %s\n", attr.isReadOnly());
		System.out.printf("isSystem : %s\n", attr.isSystem());
	}
}
