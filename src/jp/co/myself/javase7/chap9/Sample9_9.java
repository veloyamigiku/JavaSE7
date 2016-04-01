package jp.co.myself.javase7.chap9;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_9 {
	public static void main(String[] args) {
		int bufferSize = 32;
		
		Path p1 = Paths.get("C:\\sample\\chap09\\ren\\9_9.txt");
		try (SeekableByteChannel channel = Files.newByteChannel(p1)) {
			ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
			display(channel, buffer, 10, 3);
			buffer.clear();
			display(channel, buffer, 24, 5);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void display(SeekableByteChannel channel, ByteBuffer buffer, int start, int length) throws IOException {
		channel.position(start);
		channel.read(buffer);
		for (int i = 0; i < length; i++) {
			System.out.print((char)buffer.get(i));
		}
		System.out.println();
	}
}
