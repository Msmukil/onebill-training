package com.testyantra.Setassignment;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.LinkedHashSet;
	public class Comparatormain {
		public static void main(String[] args) {
			LinkedHashSetCompartor Dinesh = new LinkedHashSetCompartor(3, "Dinesh", "Trainee");
			LinkedHashSetCompartor Gokul = new LinkedHashSetCompartor(1, "Gokul", "Trainee");
			LinkedHashSetCompartor Nallish = new LinkedHashSetCompartor(2, "Nallish", "Trainee");
			LinkedHashSetCompartor Mukilan = new LinkedHashSetCompartor(5, "Mukilan", "Trainee");
			LinkedHashSetCompartor Naveen = new LinkedHashSetCompartor(4, "Naveen", "Trainee");
			LinkedHashSetCompartor Naveen1 = new LinkedHashSetCompartor(4, "Naveen", "Trainee");
			LinkedHashSetCompartor Naveen2 = new LinkedHashSetCompartor(5, "Naveen", "Trainee");

			LinkedHashSet<LinkedHashSetCompartor> linkedHashSet = new LinkedHashSet<LinkedHashSetCompartor>();
			linkedHashSet.add(Dinesh);
			linkedHashSet.add(Gokul);
			linkedHashSet.add(Nallish);
			linkedHashSet.add(Mukilan);
			linkedHashSet.add(Naveen);
			linkedHashSet.add(Naveen1);
			linkedHashSet.add(Naveen2);

			ArrayList<LinkedHashSetCompartor> arrayList = new ArrayList<>(linkedHashSet);
			
			
			Iterator<LinkedHashSetCompartor> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
			System.out.println("=========Sort By Id using Compare_To=========");
			Collections.sort(arrayList);
			Iterator<LinkedHashSetCompartor> iterator3 = arrayList.iterator();
			while (iterator3.hasNext()) {
				System.out.println(iterator3.next());
			}
			
			System.out.println("==========Sort By Id======================");
			Collections.sort(arrayList, new SortById());
			Iterator<LinkedHashSetCompartor> iterator1 = arrayList.iterator();
			while (iterator1.hasNext()) {
				System.out.println(iterator1.next());
			}

			System.out.println("==========Sort By Name=======================");

			Collections.sort(arrayList, new SortByName());
			Iterator<LinkedHashSetCompartor> iterator2 = arrayList.iterator();
			while (iterator2.hasNext()) {
				System.out.println(iterator2.next());
			}
		}
	}


