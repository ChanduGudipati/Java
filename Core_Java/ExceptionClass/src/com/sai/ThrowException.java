package com.sai;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int balance = 2500;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		int amount = sc.nextInt();
		if(amount < balance ) {
		}else {
			try {
			throw new Exception("Low Balance");		
			}finally {
				balance=0;
				System.out.println("balance "+balance);
			}
		}
		
		
		

	}

}
