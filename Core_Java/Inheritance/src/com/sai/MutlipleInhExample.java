package com.sai;

interface parent1 {
	 void add(int a, int b);	
}

interface parent2 {
	public abstract void mul(int a, int b);
}
interface parent3 {
	public abstract void add(int a, int b);
	public abstract void mul(int a, int b);
}

public class MutlipleInhExample implements parent1, parent2 ,parent3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	
}
