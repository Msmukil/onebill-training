package com.testyantra.corejava;

public class user2 {
	public static void main(String[] args) {
		overridetest t1 = new overridetest();
		t1.message();
		System.out.println(t1.add(2,1));
		
		System.out.println("=====");
		overridetest t = new overridetest();
		t.message();
		System.out.println(t1.add(2,1));
	}

}
