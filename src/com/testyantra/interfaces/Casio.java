package com.testyantra.interfaces;

public class Casio implements Calculator {
	public int add(int x,int y) {
		return x+y;
	}
	public int division(int x,int y) {
		return x/y;
	}
	
	@Override
	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}
	
	}


