package com.testyantra.Setassignment;

public class HashsetComparable implements Comparable<HashsetComparable> {
	int roll_no;
	String name;
	String dept;

	public HashsetComparable(int roll_no, String name, String dept) {
		this.roll_no = roll_no;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "HashSetComparable [roll_no=" + roll_no + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
	public int hashCode() {
		return roll_no;
	}

	@Override
//		 Object obj = new Student() ; Upcasting internally. 
	public boolean equals(Object obj) {
		HashsetComparable std = (HashsetComparable) obj; // DownCasting
		return this.roll_no == std.roll_no;
	}
	@Override
	public int compareTo(HashsetComparable o) {
		return this.roll_no - o.roll_no;
	}

}