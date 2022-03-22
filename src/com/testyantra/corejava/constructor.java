package com.testyantra.corejava;

public class constructor {
	constructor(){
		System.out.println("am from con");
	}

	public static void main(String[] args) {
		constructor con = new constructor();
		Addition.add(12,12);
		System.out.println("Addition.a");
		Addition a = new Addition();
		methodoverloading.add(13, 12);
		System.out.println("the value of b is"+a);
		
		
	}
}
