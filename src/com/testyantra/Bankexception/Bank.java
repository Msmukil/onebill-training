package com.testyantra.Bankexception;

public class Bank {
	private int balance;
	public int getbalance() {
	return balance;
}
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("balance deposit" + balance);
	}
	public void withdraw(int amount) {
		if(amount<=balance && amount>0 ) {
		balance = balance - amount;
		System.out.println("balance left" + balance);
		}else {
			try {
				throw new Insufficientbalanceexception();
			}catch (Insufficientbalanceexception e) {
				System.out.println( e.getMsg());
				
			}
			}
		}
}
