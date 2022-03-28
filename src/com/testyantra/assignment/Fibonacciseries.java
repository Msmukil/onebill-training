package com.testyantra.assignment;

	import java.util.Scanner;

	public class Fibonacciseries {
		public static void main(String[] args) {
			int limit;
			Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the limit of a series :");
			limit = sc.nextInt();
			sc.close();
			int n1 = 0, n2 = 1,n3=0;
			if(limit ==1) {
				System.out.println("Series :" + 0);
			}
			else if(limit == 2){
				System.out.println("Series :" + 0 +" "+1);
			}
			else {
				System.out.print("Series :" + 0 +" "+1);
				for(int i =2; i< limit;i++) {
					n3 = n1+ n2;
					System.out.print(" "+n3);
					n1 = n2;
					n2 = n3;
				}
				
			}
			
		}

	}



