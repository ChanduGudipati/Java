package com.sai;

final class Abc {

	public final void add() {
		System.out.println(2 + 5);
	}

}




/**
 * @author Gudipati Sai Chander
 * 
 * Final is a keyword which used to create a Immutable objects in java
 * when you declare a class as a Final you cannot extend the class 
 * when you declare a method as a Final you cannot override the method
 * when you declare a var as Final then that var cannot be changed 
 */
public class FInalKeyWordExample  {
	
	

	static final int a = 10;
	static final String email = "123456@gmail.com";

	public static void main(String[] args) {
		
		System.out.println(a);
	}

}
