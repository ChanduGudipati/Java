package com.sai;

public class StringExample {
	static String s ;
	static String s1 ;
	
	static int  i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse ="";
		String reverse_f ="";
		String s ="abcdef"; //{'a','b','c'}
		// fedcba
		char[] a =s.toCharArray();
		for(int i = a.length-1 ;  i >= 0 ; i--) {
			System.out.print(a[i] +" ");
			reverse += a[i];
		}
		System.out.println("reverse "+reverse);
		
		for(int i = 0 ;i < a.length ;i++) {
			System.out.print(a[i] +"~");
			reverse_f = a[i]+reverse_f;
		}
		
		System.out.println();
		System.out.println(reverse_f);
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		System.out.println("reverse of a string from SB "+sb.reverse());
		
		StringBuffer sb_1 = new StringBuffer();
		sb_1.append(s);
		sb_1.reverse();
		
		s.toUpperCase();
		System.out.println(s.charAt(0));
		// DIVYA DIVYANSH 
		
		// 0 -> both are equal 
		// 1 -> compared String is less than the String 
		// -1 ->compared String is greater than the String 
		System.out.println(s.compareTo("abcde"));
		
		StringBuffer  sb1 = new StringBuffer();
		sb1.append("sai");
		sb1.append("123");
		StringBuffer  sb2 = new StringBuffer();
		sb2.append("sai");
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1 == sb2);
		
		
		String myString = "Sai~Chandu~Reddy";
		System.out.println(myString.contains("Sai"));
		System.out.println(myString.contains("Chandu"));
		System.out.println(myString.contains("i C"));
		System.out.println(myString.contains("i C2"));
		
		String[] myString_array = myString.split("a");
		for(String aa:myString_array) {
			System.out.println(aa);
		}
		
		int unicode =myString.codePointAt(1);
		System.out.println(unicode);
		
		String sub ="abcdefg";
		System.out.println(sub.substring(5,6));
		
		String a1 ="ab";
		String a2 = "cd";
		String a3 ="ef";
		
		String a4= a1+" "+a2+" "+a3;
		
		String a5 = String.join(" ", a1,a2,a3);
		
		System.out.println(a4);
		System.out.println(a5);
		
				
	}

}
