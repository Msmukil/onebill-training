package com.testyantra.abstractclass;

public class BankMain {
	public static void main(String[] args) {
	BankA bankA = new BankA();
	bankA.getBalance();
	BankB bankB = new BankB();
	bankB.getBalance();
	BankC bankC = new BankC();
	bankC.getBalance();
	
	bankA.balance = 100;
	bankA.getBalance();
	
	Bank bank = new BankC();
	bank.getBalance();
	
	}
}



