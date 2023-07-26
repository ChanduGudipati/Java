package com.sai;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= 5; i++) {// 1
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {// 1
				System.out.print(i);
			}

			for (int j = 1; j <= i; j++) {// 1
				System.out.print(i);
			}
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {// 1
				System.out.print("*");
			}

			for (int j = 1; j <= i; j++) {// 1
				System.out.print("*");
			}

			System.out.println("");

		}

	}

}
