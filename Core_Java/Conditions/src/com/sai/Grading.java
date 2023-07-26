package com.sai;

public class Grading {
    static int A , B, C , D ,F;
    static String a = "A";
    static String f ="F";
	public static void main(String[] args) {
		int marks =65;
		if(marks >= 80 ) {
			System.out.println("A Grade");
		}else {
			System.out.println("F Grade");
		}
		
		String grade= (marks>=80)? a :f;
 System.out.println(grade);
	}

}
