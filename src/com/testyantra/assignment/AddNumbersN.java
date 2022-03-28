package com.testyantra.assignment;



	import java.util.Scanner;

	public class AddNumbersN {
		static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			int n, result;
			System.out.print("Enter the number of elements to be add :");
			n = sc.nextInt();
			result = Add(n);
			System.out.println(result);
		}

		static int Add(int n) {
			int sum = 0, number;
			for (int i = 0; i < n; i++) {
				number = sc.nextInt();
				sum = sum + number;
			}
			return sum;
		}

	}



