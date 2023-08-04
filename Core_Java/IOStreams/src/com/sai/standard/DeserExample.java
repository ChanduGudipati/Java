package com.sai.standard;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserExample {
	private static final long serialVersionUID = -8123884997317890921L;
	public static void main(String[] args) throws Exception{
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("d://Employee1.txt"));
		Employee emp =(Employee)oin.readObject();
		System.out.println(emp.getSal());
	}

}
