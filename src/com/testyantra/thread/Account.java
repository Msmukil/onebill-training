package com.testyantra.thread;

public class Account {
	double balance;
	public Account(double balance) {
		this.balance = balance;
	}
	
	public synchronized void  withdraw(int amount) {
		if(amount<balance) {
			balance = balance - amount;
		}
	
	}
	public void deposit(int amount) {
		balance = balance+amount;
	}
	public void getBalance() {
		System.out.println("balance left" +balance);
	}

}
