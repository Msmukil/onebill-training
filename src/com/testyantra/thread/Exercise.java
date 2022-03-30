package com.testyantra.thread;

public class Exercise {
	public void chat() {
		System.out.println("this is from exercise ");
	}
	public static void test() {
		System.out.println("this is from test method");
	}
	public static void main(String[] args) {
		Interface3 t = new Exercise()::chat;
		t.message();
		
		Interface3 t1 = Exercise::test;
		t1.message();
				
	}

}
