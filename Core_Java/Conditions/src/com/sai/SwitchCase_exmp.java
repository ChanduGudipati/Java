package com.sai;

public class SwitchCase_exmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =11; 
		
		switch (age) {
		case 10:
			System.out.println("age is 10");
			break;//comes out of the switch case
		case 11:
			System.out.println("age is 11");
			break;
		case 12:
		 System.out.println("age is 12");
		   	break;
		default:
			System.out.println("age is not available in the limit");
			break;
		}

	}

}
