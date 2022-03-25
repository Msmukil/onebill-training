package com.testyantra.abstractclass1;

public abstract class AbstractVsNonabstract {
	AbstractVsNonabstract(){
		System.out.println("This is Constructor of abstract class");
	}
	abstract void a_method();
	void b_method() {
		System.out.println("This is a normal method of abstract class");
	}
}


