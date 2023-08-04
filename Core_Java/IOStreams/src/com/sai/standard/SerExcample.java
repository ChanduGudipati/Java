package com.sai.standard;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerExcample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("d://DeSerilZaion.ser");
		ObjectInputStream os = new ObjectInputStream(fs);
		System.out.println(os.readInt());
		System.out.println(os.readObject());
		os.close();

	}

}
