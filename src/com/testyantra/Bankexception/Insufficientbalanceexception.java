package com.testyantra.Bankexception;

public class Insufficientbalanceexception extends RuntimeException {

	public String msg;
	
	public void InsufficientBalanceException(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}

}
