package com.sai;

class Parent4 { // Parent$
	public void add(int a, int b) {
		System.out.println(a + b);
	}
}
class Child extends Parent4 { // parent4+child

}
public class MultiLevelInhExample extends Child {
	// parent4+child+MultiLevelInhExample
	public static void main(String[] args) {
		MultiLevelInhExample mi = new MultiLevelInhExample();
		mi.add(10, 20);
	}
}
