package com.testyantra.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Company {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//ArrayList list = new ArrayList();
		Employee mukilan= new Employee(1,"mukilan","developer",100000);
		Employee raj= new Employee(2,"raj","developer",100000);
		Employee krishna= new Employee(3,"krishna","developer",100000);
		Employee mohan= new Employee(4,"mohan","developer",100000);
	
		
		ArrayList list = new ArrayList();
		list.add(mukilan);
		list.add(raj);
		list.add(krishna);
		list.add(mohan);
		
		Collections.sort(list);
		
		Iterator<Employee>it =  list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list.get(2));
	}

}
