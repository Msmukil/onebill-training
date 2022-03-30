package com.testyantra.thread;

public class Test {
	public static void main(String[] args) {
		MyFunctionalInterface obj = (x,y)-> {
			return x+y;
		};
		double add = obj.add(30,40);
		System.out.println(add);
	}

	public Object message;

}
