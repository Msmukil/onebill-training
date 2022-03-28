package com.testyantra.collections;

import java.util.List;
import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		
		List l = new ArrayList();
		l.add(100);
		l.add(200);
		list.addAll(l);
		
		
		ArrayList li = new ArrayList();
		li.add(4);
		li.add(5);
		
		list.removeAll(li);
		System.out.println(l);
		System.out.println(list);
		System.out.println(list.get(1));
	}

}
