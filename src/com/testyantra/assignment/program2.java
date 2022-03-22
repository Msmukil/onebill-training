package com.testyantra.assignment;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter n");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++) {
			System.out.println(i+"x"+n+"=" +n*i);
		}
		
	}

}