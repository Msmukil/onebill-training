package com.testyantra.thread;

public class Women extends Thread {
	
	private Account account;
	public Women(Account account) {
		this.account = account;
	}
	
	
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			account.withdraw(100);
		}
	}

}



