package com.testyantra.assignment;


	import java.util.Scanner;

	public class ArrayExercise {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int length, ArrElement;
			System.out.print("Enter the length of an array :");
			length = sc.nextInt();

			int[] arr = new int[length];
			for (int i = 0; i < length; i++) {
				System.out.print("Enter " + (i + 1) + " number:");
				ArrElement = sc.nextInt();
				arr[i] = ArrElement;
			}
			sc.close();

			int[] result = new int[2];
			result = ArrayMethod(arr);
			System.out.println(result[0] + " " + result[1]);
		}

		static int[] ArrayMethod(int[] arr) {
			int arr1 = 0, arr2 = 0;
			if (arr.length == 0) {
				arr1 = 0;
				arr2 = 0;
			} else if (arr.length == 1) {
				arr1 = arr[0];
				arr2 = 0;
			} else {
				arr1 = arr[0];
				arr2 = arr[1];
			}
			int[] res = { arr1, arr2 };
			return res;
		}
	}



