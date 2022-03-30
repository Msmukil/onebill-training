package com.testyantra.Set;



public class Student {
	String name;
			int id;
		
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
			
			
	@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + "]";
		}




		@Override
		public int hashCode() {
			
			return id ;
		}



		@Override
		public boolean equals(Object obj) {
			Student std = (Student) obj;
			return super.equals(obj);
	
		}
		
		}

		