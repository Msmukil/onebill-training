package com.testyantra.Setassignment;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.TreeSet;

	public class Mainn {
		public static void main(String[] args) {
			TreeSetSort dinesh = new TreeSetSort(2, "Dinesh", "Cse");
			TreeSetSort gokul= new TreeSetSort(4, "Gokul", "Civil");
			TreeSetSort nallish = new TreeSetSort(1, "Nallish", "EEE");
			TreeSetSort dinesh2 = new TreeSetSort(1, "Dinesh", "EEE");
			TreeSetSort mahesh = new TreeSetSort(3, "mahesh", "Cse");
			TreeSetSort mahesh2 = new TreeSetSort(3, "mahesh", "Cse");
			TreeSetSort mahesh3 = new TreeSetSort(4, "mahesh", "Cse");

			TreeSet<TreeSetSort> treeSet = new TreeSet<TreeSetSort>();
			treeSet.add(dinesh);
			treeSet.add(gokul);
			treeSet.add(nallish);
			treeSet.add(dinesh2);
			treeSet.add(mahesh);
			treeSet.add(mahesh2);
			treeSet.add(mahesh3);
			
			Iterator<TreeSetSort> iterator2 = treeSet.iterator();
			while (iterator2.hasNext()) {
				System.out.println(iterator2.next());
			}
	        System.out.println("==========Sort By Name using Comparable===========");
			ArrayList<TreeSetSort> arrayList = new ArrayList<>(treeSet);
			Collections.sort(arrayList);
			Iterator<TreeSetSort> iterator1 = treeSet.iterator();
			while (iterator1.hasNext()) {
				System.out.println(iterator1.next());
			}

		}
	}



