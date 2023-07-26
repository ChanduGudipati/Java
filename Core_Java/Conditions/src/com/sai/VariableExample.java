package com.sai;

public class VariableExample {

	static boolean boolean_var ;//static var
	static int int_var;
	float float_var;//instance var
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.out.println(boolean_var);
		System.out.println(int_var);
	

	}
	public void meth() {
		// TODO Auto-generated method stub
		int c = 0;//local variables
		c = ++c;
		System.out.println(c);

	}

}
