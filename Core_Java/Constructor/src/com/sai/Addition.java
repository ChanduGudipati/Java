package com.sai;

public class Addition {

	static int a ;
	static int b;
	static int c;
	static float e;
	public Addition(int a , int b , int c) {
		this.b = a;
		this.a = b;
		this.c = c;
	}
	public Addition(int a ) {
		this.a = a;
		System.out.println("one parameter int");
		new Addition(100,20);
	}
	public Addition(int a , int b ) {
		this.a = a;
		this.b = b;
		new Addition(100,20.10f);
		System.out.println("two parameter int");
	}
	public Addition(int a , float f ) {
		this.a = a;
		this.e = f;
		System.out.println("two parameter float");
		new Addition(1000,20,30);
	}
	public Addition(float a , int f ) {
		
	}
	public   Addition() {
			System.out.println("hello i m from constructor");
			new Addition(100);
	}
	public int add(int a , int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Addition add=new Addition();// calling the constru
		System.out.println("a -> "+a);
		
	}
	
	static int method() {
		return 1;
	}

}
