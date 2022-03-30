package com.testyantra.thread;

public class lambda {
	public static void main(String[] args) {
		Runnable run = ()-> {
			for (int i=0;i <10;i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(run);
		thread.start();
	}
	}


