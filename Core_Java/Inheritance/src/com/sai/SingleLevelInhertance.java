package com.sai;

class Parent{
	public void add(int a , int b) {
		System.out.println(a+b);
	}
}


public class SingleLevelInhertance extends Parent{

	public static void main(String[] args) {
		SingleLevelInhertance si = new SingleLevelInhertance();
		si.add(10, 20);
	}

}
