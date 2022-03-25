package com.testyantra.corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException; 

public class checked {
	public static void main(String[] args) {
		System.out.println("starts");
		File file = new File ("file");
		try {
			FileReader fr = new FileReader(file);
			int read = fr.read();
			while(read != -1) {
				System.out.println((char) read);
				read =  fr.read();
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("does not exist");
		}catch(IOException e) {
			System.out.println("no data");
			}
		System.out.println("end");
		}
	}


