package com.testyantra.thread;

public class Man extends Thread {
	Account account;
	
	public Man(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			account.withdraw(100);
		}
	}

}
