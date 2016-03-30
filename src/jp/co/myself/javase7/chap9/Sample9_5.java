package jp.co.myself.javase7.chap9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Sample9_5 {
	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("c:\\sample\\chap09\\ren\\9_5.txt");
		Path p2 = Paths.get("c:\\sample\\chap09\\ren\\9_5_cp.txt");
		Path p3 = Paths.get("c:\\sample\\chap09\\ren\\9_5_org.txt");
		Path p4 = Paths.get("c:\\sample\\chap09\\ren\\9_5_mv.txt");
		Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
		Files.move(p3, p4, StandardCopyOption.REPLACE_EXISTING);
		Files.delete(p1);
	}
}
