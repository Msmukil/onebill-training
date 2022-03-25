package com.testyantra.has$relation;

public class Test {
	public static void main(String[] args) {
		System.out.println("starts");
		try {
			throw new ArithmeticException();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
