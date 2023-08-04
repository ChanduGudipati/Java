package com.sai.standard;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DeSerilZaion {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int i = 10;
		String s ="Sai Chander";
		
		FileOutputStream io = new FileOutputStream(new File("d://DeSerilZaion.ser"));
		ObjectOutputStream out = new ObjectOutputStream(io);
		out.writeInt(i);
		out.writeObject(s);
		out.close();
		System.out.println("file done");
	}

}
