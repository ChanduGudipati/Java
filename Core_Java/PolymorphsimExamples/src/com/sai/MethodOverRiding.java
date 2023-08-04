package com.sai;

class Parent {
	static String DB = "Mysql";

	public static void add(int a, int b) {
		System.out.println("parent class method "+ (a + b));
	}
}
/**
 * @author Gudipati Sai Chander
 * Method Overloading is a concept of Polymorphism where the 
 * parent class functionality will be over ridden in the child class
 * 
 * Rules of method over riding
 * 1)We Two class in a relation ship(parent and child)
 * 2)(Method name + Parameters) method signature should be same
 * 3)to call the child class over ridden method to can call directly
 * 4)when you wanted to call parent class method u can 
 * use Super keyword
 */
public class MethodOverRiding extends Parent {
	static String DB ="Oracle";
	static int a = 20;
	public static void add(int a, int b) {
		System.out.println("from child class overmethod " +(a/2 + b/2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverRiding mo = new MethodOverRiding();
		mo.callingMethod();
	
		
	}
	void callingMethod() {
		add(10, 20);
		super.add(10, 20);
		System.out.println(super.DB);
	}

}
