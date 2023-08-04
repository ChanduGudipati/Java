package com.sai.standard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		writeToAFile();
		readFromTheFile();

	}

	private static void readFromTheFile() {
		// TODO Auto-generated method stub
		try (FileReader fs = new FileReader("d://BufferedReaderExample.txt");
				BufferedReader br = new BufferedReader(fs);) {

			while (br.read() != -1)
				System.out.println(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void writeToAFile() {
		// create a file
		File f = new File("d://BufferedReaderExample.txt");

		try (FileWriter fs = new FileWriter(f); BufferedWriter br = new BufferedWriter(fs);) {

			String s = "Hi there this is java class";
			br.append(s);
			br.newLine();
			br.append("Hi there This is the 2nd line");
			br.newLine();
			br.append("this is 3rd line");

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("file created");

	}

}
