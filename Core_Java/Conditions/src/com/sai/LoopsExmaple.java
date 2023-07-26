package com.sai;

public class LoopsExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		           //10  10
		int line =5;
		for(int i = 1 ;i <= line ; i ++) {
			 for(int j =i ;j<=line ; j++) {
				 System.out.print(" "); 
			 }
			 for(int j = 1 ;j < i ; j ++) {
				 System.out.print("*"); 
			 }
			 for(int j = 1 ;j <= i ; j ++) {
				 System.out.print("*"); 
			 }
			System.out.println("");
			
		}

	}

}
