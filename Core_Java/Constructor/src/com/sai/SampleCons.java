package com.sai;

import java.util.Date;

public class SampleCons {

	int SampleCons() {
		System.out.println("from int retun");
		return 0;
	}
	SampleCons() {
		System.out.println("from coms");
		new SampleCons(10);

	}
	SampleCons(int i) {
		System.out.println("from coms "+i);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleCons cons=new SampleCons();
		new SampleCons(10);
			
	}
	
	public static int add() {
		return 1+3;
	}

}
