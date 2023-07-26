package com.sai.abstractexample;

abstract class Abs {
	public int add(int a, int b) {
		return a + b;
	}
/*
 * Rule 1 :- abstract methods should not have a body (a body which is present in side {}) 
 * Rule 2 :- abstract methods ends with ;
 * Rule 3 :- abstract methods present in a class need to declare with abstract keyword
 * Rule 4 :- abstract methods present in a interface are by default public and abstract
 * Rule 5 :- when a class consists of an abstract method (even one)then we need to 
 *           declare the class with abstract keyword
 *            
 */
	 public abstract int add_abstract(int a, int b);
}
/* Rule1 :- even the class doesn't consists of an abstract method still you can make the 
 * 			class as abstract (simply declare the class with abstract keyword)
 * Rule 2 :- Even if a class consists of one abstract method declare the class with abstract keyword
 * Rule 3 :- When a child class inherits the abstract class the child class needs to 
 *           override the abstract methods or declare the child class as abstract
 */
abstract class Abs2{
	
}
public class AbstractExample {
	public static void main(String[] args) {
		
	}
}
