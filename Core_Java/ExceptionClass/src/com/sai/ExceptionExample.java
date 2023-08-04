package com.sai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Gudipati Sai Chander
 * Exception is an abnormal condition 
 * which interupt the normal flow of the program 
 */
public class ExceptionExample {

	/**
	 * @param args
	 * Exceptions which are ocuurred at the complie we called them as
	 * checked exceptions
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*
			 * the precise code which you well will throw a exception
			 * that code will go into try
			 * */
		FileInputStream fis = new FileInputStream(new File("abc"));
		}catch (Exception e) {
		/*
		 * Exception handling code
		 * */	
		System.err.println("the class trown an exception "+e.getMessage());	
			
		}
	}

}
