package com.testyantra.assignment3;

public class MethodReference {
	public void chat(String str) {
		System.out.println("this is from chat" + " "+str);
	}
	public static void test(String str) {
		System.out.println("this is from test" + " "+str);
	}
	public static void main(String[] args) {
		MethodRefInterface m = new MethodReference()::chat;
		m.message("Mukilan");
		System.out.println("=====");
		MethodRefInterface m1 = MethodReference::test;
		m1.message("Mohan");
		
	}
		}


