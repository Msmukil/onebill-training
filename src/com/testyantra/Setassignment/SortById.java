package com.testyantra.Setassignment;


	import java.util.Comparator;

	public class SortById implements Comparator<LinkedHashSetCompartor>{

		@Override
		public int compare(LinkedHashSetCompartor o1, LinkedHashSetCompartor o2) {
			return  o1.roll_no - o2.roll_no;
		}

	}



