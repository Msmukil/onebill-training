package com.testyantra.corejava;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Mohan {
	public static String task(File file) throws IOException {
		String s = "";
		FileReader fr = new FileReader(file);
		int read = fr.read();
		while(read != -1 ) {
			s = s + ((char) read);
			read = fr.read();
		}
		return s;
	}

}
