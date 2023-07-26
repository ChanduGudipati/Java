package com.sai;

public class Cond1 {

	static int bank_balance , withdraw_limit , withdraw_amount ;
	public static void main(String[] args) {
		bank_balance =25000;
		withdraw_limit=10000;
		withdraw_amount=35000;
	
		
		if(withdraw_amount <= bank_balance ) {
			if(withdraw_amount <=withdraw_limit  ) 
				System.out.println("Money can be dispense");
			else 
				System.err.println("please enter lesser amount");
			
			
		}else {
			
			System.err.println("Low Amount");
		}
		
		
	}

}
