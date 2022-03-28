package com.testyantra.collections;

public class Employee implements Comparable<Employee>  {
	int id;
	String name;
	String designation;
	double salary;
	public Employee(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.id-o.id;
	}
	
	

}
