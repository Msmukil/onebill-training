package com.testyantra.assignment;

public class CompileTImeCaller {
	
		public static void main(String[] args) {
			System.out.println("Program Start");
			CompileTimeReceipient compileTimeRecipient = new CompileTimeReceipient();
			try {
				compileTimeRecipient.thread();
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("InterruptedException is handled");
			}
			System.out.println("Program End");
		}

	}


