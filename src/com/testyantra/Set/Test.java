package com.testyantra.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<>();
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		hashset.add(40);
		hashset.add(50);
		Iterator<Integer> iterator = hashset.iterator();
		while(iterator.hasNext() ) {
			System.out.println(iterator.next());
		}
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
		linkedhashset.add(20);
		linkedhashset.add(30);
		linkedhashset.add(30);
		Iterator<Integer> iterator2 = linkedhashset.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		TreeSet<Integer> Treeset = new TreeSet<>();
		Treeset.add(50);
		Treeset.add(40);
		Treeset.add(70);
		Iterator<Integer> iterator3 = Treeset.iterator();
		while(iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
	}
}
