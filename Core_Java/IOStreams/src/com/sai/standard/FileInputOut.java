package com.sai.standard;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInputOut {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		readFromTheFile();
		writeIntoTheFile();
	}

	private static void writeIntoTheFile()throws Exception {
		// TODO Auto-generated method stub
		FileWriter fs = new FileWriter(new File("d://FileInputOut.txt"));
		fs.write("Welcome to the java class");
		System.out.println("file generated");
		fs.flush();
		fs.close();
	}

	private static void readFromTheFile() throws Exception{
		FileReader fs = new FileReader("d://BufferedStreamExample.txt");
		int i ;
		while ((i =fs.read()) != -1)
			System.out.print((char)i);
		
	}

}
