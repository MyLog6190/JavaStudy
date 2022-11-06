package _15_io.practice.p02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class HaxaViewer {
	public static void main(String[] args) throws IOException {
		File file = new File("./test");
		FileInputStream fis = new FileInputStream(file);
		PrintStream ps = new PrintStream(System.out);
		int result = fis.read();
		while(result == -1) {
			ps.printf("%x", result);
		}
	}
}
