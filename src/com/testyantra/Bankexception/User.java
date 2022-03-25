package com.testyantra.Bankexception;

public class User {
	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(bank.getbalance());
		bank.deposit(1000);
		bank.withdraw(500);
		bank.withdraw(600);
	}

}
