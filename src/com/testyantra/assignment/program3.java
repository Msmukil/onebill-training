package com.testyantra.assignment;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum=0;
		for(int i=0;i<c;i++) {
			int result =0;
			for(int j=0;j<=i;j++) {
				result= result+(int)(((Math.pow(2, j))*b));
			}
			System.out.println(a+result);
		}
	}

}
