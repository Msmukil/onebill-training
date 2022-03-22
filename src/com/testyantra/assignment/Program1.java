package com.testyantra.assignment;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("even numbers:");
		for(int i=0;i<=n;i++) {
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("odd");
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
