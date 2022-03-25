package com.testyantra.has$relation;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int number1 = scan.nextInt();
		System.out.println("enter 2 number");
		int number2 = scan.nextInt();
		int res = 0;
		res = number1 / number2;
		
		int [] a;
		a = new int [res];
		a[4] = 20;
		System.out.println(a[4]);
		System.out.println(res);
		
		} catch (ArithmeticException e)  {
			System.out.println("the index");
		} {
		
		}
		System.out.println("program end");
	}

}
