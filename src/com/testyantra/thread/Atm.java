package com.testyantra.thread;

public class Atm {
	public static void main(String[] args) {
		Account account = new Account(100000);
		Man man = new Man(account);
		Women women = new Women(account);
		
		man.start();
		women.start();
		
		try {
			Thread.sleep(1000);
			account.getBalance();
		} catch (InterruptedException e) {}
		
	}

}
