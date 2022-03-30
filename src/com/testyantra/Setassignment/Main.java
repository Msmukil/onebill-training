package com.testyantra.Setassignment;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.HashSet;
	import java.util.Iterator;

	public class Main {
		public static void main(String[] args) {
			HashsetComparable dinesh = new HashsetComparable(2, "Dinesh", "Cse");
			HashsetComparable gokul = new HashsetComparable(4, "Gokul", "Civil");
			HashsetComparable nallish = new HashsetComparable(1, "Nallish", "EEE");
			HashsetComparable dinesh2 = new HashsetComparable(1, "Dinesh", "EEE");
			HashsetComparable mahesh = new HashsetComparable(3, "mahesh", "Cse");
			HashsetComparable mahesh2 = new HashsetComparable(3, "mahesh", "Cse");
			HashsetComparable mahesh3 = new HashsetComparable(4, "mahesh", "Cse");

			HashSet<HashsetComparable> hashSet = new HashSet<HashsetComparable>();
			hashSet.add(dinesh);
			hashSet.add(gokul);
			hashSet.add(nallish);
			hashSet.add(dinesh2);
			hashSet.add(mahesh);
			hashSet.add(mahesh2);
			hashSet.add(mahesh3);

			ArrayList<HashsetComparable> arrayList = new ArrayList<>(hashSet);
			System.out.println("===Sort By Id using Comparable");
			Collections.sort(arrayList);
			Iterator<HashsetComparable> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		}
	}



