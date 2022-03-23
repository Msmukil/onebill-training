package com.testyantra.assignment;

public class manager extends member {
	String Department;
	public manager(String Name, int Age, long phonenumber, String Address, long Salary,String Department) {
	super(Name, Age, phonenumber, Address, Salary);
	System.out.println(Department);

}
}
