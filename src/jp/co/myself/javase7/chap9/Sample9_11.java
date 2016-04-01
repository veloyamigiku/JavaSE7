package jp.co.myself.javase7.chap9;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
	
	@Override
	public FileVisitResult preVisitDirectory(Path arg0, BasicFileAttributes arg1)
			throws IOException {
		System.out.println("preVisitDirectory() : " + arg0);
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFile(Path arg0, BasicFileAttributes arg1)
			throws IOException {
		System.out.println("visitFile() : " + arg0);
		return FileVisitResult.CONTINUE;
	}
	
}

public class Sample9_11 {
	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("C:\\sample\\chap09\\ren\\9_11");
		
		Files.walkFileTree(p1, new MyFileVisitor());
	}
}
