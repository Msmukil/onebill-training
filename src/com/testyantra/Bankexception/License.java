package com.testyantra.Bankexception;

public class License {
	int age;
	String name;
	
	public void  getAge() {
		return;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		} else {
			System.out.println("enter valid age");
		}
		
	}
	public void checkAge() {
		if (age >=18) {
			this.age = age;
		}else {
			System.out.println("age");
		}
	
	try {
		throw new InsufficientAgeexception();
	}catch (InsufficientAgeexception e) {
		System.out.println( e.getMessage());


}
	}
	public static String next() {
		// TODO Auto-generated method stub
		return null;
	}
}
