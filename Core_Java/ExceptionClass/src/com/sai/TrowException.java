package com.sai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Gudipati Sai Chander
 *
 */

public class TrowException {
	/**
	 * @author Gudipati Sai Chander when ever you are using throws keyword on main
	 *         method JVM will provide the default exception handling tech
	 */
	public static void main(String[] args) {

		try {
			try {

			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			try {

			} catch (Exception e1) {
				// TODO: handle exception
			}
		}
		try {

		} finally {
			try {

			} catch (Exception e1) {
				// TODO: handle exception
			}
		}

		try {
			int a = 10 / 0;
			FileInputStream fs = new FileInputStream(new File("abc"));
			System.out.println("hello");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("from finally");
		}

	}

}