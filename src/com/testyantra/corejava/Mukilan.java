package com.testyantra.corejava;

import java.io.File;
import java.io.IOException;

public class Mukilan {
	public static void main(String[] args) {
		Mohan mohan = new Mohan();
		File file = new File("File");
		String task;
		try {
			task = Mohan.task(file);
			System.out.println(task);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
