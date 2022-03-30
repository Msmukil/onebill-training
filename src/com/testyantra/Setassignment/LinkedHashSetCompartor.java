package com.testyantra.Setassignment;


	public class LinkedHashSetCompartor implements Comparable<LinkedHashSetCompartor>{
		int roll_no;
		String name;
		String designation;

		public LinkedHashSetCompartor(int roll_no, String name, String dept) {
			this.roll_no = roll_no;
			this.name = name;
			this.designation = dept;
		}

		@Override
		public String toString() {
			return "LinkedHashSetCompartor [roll_no=" + roll_no + ", name=" + name + ", dept=" + designation + "]";
		}

		@Override
		public int hashCode() {
			return roll_no;
		}

		@Override
//			 Object obj = new Student() ; Upcasting internally. 
		public boolean equals(Object obj) {
			LinkedHashSetCompartor std = (LinkedHashSetCompartor) obj; // DownCasting
			return this.roll_no == std.roll_no;
		}

		@Override
		public int compareTo(LinkedHashSetCompartor o) {
			return this.roll_no - o.roll_no;
		}

	}


