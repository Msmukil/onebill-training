package com.testyantra.corejava;

public class owner {
	public static void main(String[] args) {
		car car = new car();
		car.brake();
		car.drive();
		car.horn();
		
		System.out.println("===");
		ferrari ferrari = new ferrari();
		ferrari.drive();
	}

}
