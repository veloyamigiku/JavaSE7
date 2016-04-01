package jp.co.myself.javase7.chap9;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import javax.print.attribute.standard.Finishings;

class MyFind extends SimpleFileVisitor<Path> {
	
	private final PathMatcher matcher;
	private int numMatches = 0;
	
	MyFind(String pattern) {
		FileSystem fs = FileSystems.getDefault();
		matcher = fs.getPathMatcher("glob:" + pattern);
	}
	
	private void find(Path file) {
		Path name = file.getFileName();
		if (name != null && matcher.matches(name)) {
			numMatches++;
			System.out.println(file);
		}
	}
	
	public void done() {
		System.out.println("Matched: " + numMatches);
	}
	
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
			throws IOException {
		find(dir);
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
			throws IOException {
		find(file);
		return FileVisitResult.CONTINUE;
	}
	
}

public class Sample9_12 {
	public static void main(String[] args) throws IOException {
		//Path p1 = Paths.get("C:\\sample\\chap09");
		Path p1 = Paths.get("C:\\Users\\Leon\\workspaceN2\\JavaSE7");
		MyFind finder = new MyFind("*.java");
		Files.walkFileTree(p1, finder);
		finder.done();
	}
}
