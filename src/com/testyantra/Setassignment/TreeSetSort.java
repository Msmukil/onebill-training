package com.testyantra.Setassignment;


	public class TreeSetSort implements Comparable<TreeSetSort>{
		int roll_no;
		String name;
		String dept;

		public TreeSetSort(int roll_no, String name, String dept) {
			this.roll_no = roll_no;
			this.name = name;
			this.dept = dept;
		}

		@Override
		public String toString() {
			return "Student [roll_no=" + roll_no + ", name=" + name + ", dept=" + dept + "]";
		}
		@Override
		public int hashCode() {
			return roll_no;
		}
		@Override
//		 Object obj = new Student() ; Upcasting internally. 
		public boolean equals(Object obj){
			TreeSetSort std = (TreeSetSort) obj; // DownCasting
			return this.roll_no==std.roll_no;
		}
		@Override
		public int compareTo(TreeSetSort o) {
			return this.name.compareTo(o.name);
		}

	}


