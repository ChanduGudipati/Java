package com.sai.standard;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			//writeToAFile();
			readFromTheFile();
	}

	private static void readFromTheFile()throws Exception {
		FileInputStream fin = new FileInputStream("d://BufferedStreamExample.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i;
		while((i =bin.read()) != -1)
		System.out.print((char)i);
		 
		
	}

	private static void writeToAFile()   {
		File f = new File("d://BufferedStreamExample.txt");// file is created 
		try(
				FileOutputStream fout = new FileOutputStream(f);// out put stream 
				BufferedOutputStream bos = new BufferedOutputStream(fout);//buffered data -> fout	
		  ) {
		
		String s_text ="welcome to java 8 AM Batch";//data
		byte[] b=s_text.getBytes();//data -->byte
		bos.write(b);// writing to the file		
        System.out.println("file is generated"); 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
