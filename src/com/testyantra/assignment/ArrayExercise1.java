package com.testyantra.assignment;


	import java.util.Scanner;

	public class ArrayExercise1 {
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

			boolean result = ArrayMethod(arr);
			System.out.println(result);
		}

		static boolean ArrayMethod(int[] arr) {
			if (arr.length > 1) {
				int res = 0, i = 0;
				while (i < arr.length-1) {
					if (arr[i] == 3 && arr[i] != arr[i + 1]) {
						res++;
					}
					i++;
				}
				if (res == 3 || (res == 2 && arr[arr.length-1] == 3)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}


