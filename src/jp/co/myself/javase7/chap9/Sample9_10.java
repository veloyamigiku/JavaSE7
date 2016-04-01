package jp.co.myself.javase7.chap9;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_10 {
	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		Iterable<Path> dirs = fs.getRootDirectories();
		for (Path name : dirs) {
			System.out.println("RootDirectories : " + name);
		}
		Path dir = Paths.get("C:\\sample\\chap09\\ren\\9_10");
		
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			for (Path file : stream) {
				System.out.println(file.getFileName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
