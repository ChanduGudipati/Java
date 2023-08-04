package com.sai;

/**
 * @author Gudipati Sai Chander
 * Method overloading is a concept where you will be using the 
 * same method for different functionalities 
 * 
 * Rules of method overloading:-
 * 1)Method name should be same.  
 * 2)Method should have different parameters 
 * 3)Method overloading can be done in the same class 
 * 4)Based up on the calling with the parametrs the method
 * will be selected
 *
 */
public class MethodOverLoading {
	static int sum;
	static float float_sum;
	public static int add(int a, int b) {
		return a + b;
	}
	public static int add(int a, int b,int c) {
		return a + b + c;
	}
	
	
	public static int add(int a, int b,int c,int d) {
		return a + b + c+d;
	}
	public static float add(float a, float b) {
		return a + b;
	}
	public static float add(int a , float b) {
		System.out.println("line number 32");
		return a + b;
	}
	public static float add(float a , int b) {
		return a + b;
	}
	public static float add(float a , int b ,float c) {
		return a + b +c;
	}
	
	public static void main(String[] args) {
		int a = 10, b = 20 ,c =15,d= 20;
		float f1 =1.5f ,f2 = 2.5f;
		sum = add(a, b,c,d);
		float_sum =add(f1,a,f2);
		System.out.println("float_sum is = " + float_sum);

	}

}
