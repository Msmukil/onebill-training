package com.testyantra.assignment;

public class employee extends member {
	String Specialization;
	public employee(String Name, int Age, long phonenumber, String Address, long salary,String specialization) {
	super (Name, Age, phonenumber, Address, salary);
	System.out.println(Specialization);

}
}