package com.testyantra.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Student1 {
	

	public static void main(String[] args) {
		Student student = new Student(3, "bat");
		Student student2 = new Student(1, "super");
		Student student3 = new Student(4, "spider");
		Student student4 = new Student(2, "spider");
		
		
		HashSet<Student> hashset = new HashSet<>();
		hashset.add(student);
		hashset.add(student2);
		hashset.add(student4);
		hashset.add(student3);
	     for(Student std : hashset) {
			System.out.println(std);
			
			ArrayList<Student> arraylist = new ArrayList<>(hashset);
           Sortbyname sortbyname = new Sortbyname();
           Collections.sort(arraylist,sortbyname);
           for(Student array : arraylist) {
        	   System.out.println(array);
           }
		}
	}

	private static void arraylist() {
		// TODO Auto-generated method stub
		
	}

}
