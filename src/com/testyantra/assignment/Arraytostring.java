package com.testyantra.assignment;


	  
	import java.util.ArrayList;
	  
	
	class Employee {
	  
	   
	    private String EmployeeName;
	    private int EmployeeId;
	    private double EmployeeSalary;
	  
	 
	    Employee(String name, int id, double salary)
	    {
	        this.EmployeeSalary = salary;
	        this.EmployeeName = name;
	        this.EmployeeId = id;
	    }
	  
	 
	    public String toString()
	    {
	        return "   Employee Name = " + this.EmployeeName
	            + "    Employee Id = " + this.EmployeeId
	            + "    Employee Salary = "
	            + this.EmployeeSalary;
	    }
	}
	  
	public class Arraytostring {
	    public static void main(String[] args)
	    {
	       
	        ArrayList<Employee> ArrList
	            = new ArrayList<Employee>();
	        ArrList.add(new Employee("Mukil", 1001, 52000.0));
	        ArrList.add(new Employee("Rajan", 1002, 65000.0));
	        ArrList.add(new Employee("mohan", 1003, 53000.0));
	        ArrList.add(new Employee("harish", 1004, 45000.0));
	        ArrList.add(new Employee("sasi", 1005, 38000.0));
	        for (Employee t : ArrList) {
	            System.out.println(t);
	        }
	    }
	}



