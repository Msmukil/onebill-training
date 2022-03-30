package com.testyantra.Setassignment;


	import java.util.Comparator;

	public class SortByName implements Comparator<LinkedHashSetCompartor> {

		@Override
		public int compare(LinkedHashSetCompartor o1, LinkedHashSetCompartor o2) {
			return o1.name.compareTo(o2.name);
		}

	}



