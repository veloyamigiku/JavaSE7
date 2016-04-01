package jp.co.myself.javase7.chap9;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Sample9_13 {
	public static void main(String[] args) throws IOException {
		Path dir = Paths.get("C:\\sample\\chap09\\ren\\9_13");
		
		FileSystem fs = FileSystems.getDefault();
		WatchService watcher = fs.newWatchService();
		dir.register(watcher,
				StandardWatchEventKinds.ENTRY_CREATE,
				StandardWatchEventKinds.ENTRY_DELETE,
				StandardWatchEventKinds.ENTRY_MODIFY);
		for( ; ; ) {
			WatchKey key = null;
			try {
				key = watcher.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (WatchEvent<?> event : key.pollEvents()) {
				WatchEvent.Kind<?> kind = event.kind();
				String name = kind.name();
				switch (name) {
				case "OVERFLOW":
					System.out.println("OVERFLOW");
					break;
				case "ENTRY_CREATE":
					System.out.println("ENTRY_CREATE");
					break;
				case "ENTRY_DELETE":
					System.out.println("ENTRY_DELETE");
					break;
				case "ENTRY_MODIFY":
					System.out.println("ENTRY_MODIFY");
					break;
				}
			}
			key.reset();
		}
	}
}
