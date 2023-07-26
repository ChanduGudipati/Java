package com.sai.abstractexample;

abstract class Abs3 {
	
	
	abstract void add(int a, int b);
	public void mul(int a, int b) {
		System.out.println( (a * b)* 2);
	}
}

// how many abstract methods does AbstractExample2 class have
public  class AbstractExample2 extends Abs3 {
    //AbstractExample2 + Abs3
	//main + abstract add + mul
	@Override
	public void mul(int a, int b) {
		System.out.println(a *b);
	}
	public static void main(String[] args) {
		
		AbstractExample2 exe = new AbstractExample2();
		exe.mul(10, 20);
	}
	@Override
	void add(int a, int b) {
		System.out.println(a+b);
		super.mul(10, 20);
	}
}
