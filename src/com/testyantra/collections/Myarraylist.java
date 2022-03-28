package com.testyantra.collections;

public class Myarraylist {
	private Object[] array;
	private int size = 10;
	int position;
	public Myarraylist() {
		array = new Object[size];
	}
	public Myarraylist(int size) {
		this.size = size;
		array = new Object[size];
	}

	public void add(Object Obj) {
		if(position>= size) {
			increasecapacity();
		}
		array[position] = Obj;
		position++;
	}
	private void increasecapacity() {
		this.size = ((size*3)/2)+1;
		Object[]temp = new Object[size];
		for (int i = 0;i<array.length;i++) {
			temp[i]=array[i];
		}
		array = temp;
	}
		public void test() {
			for (int i = 0;i<array.length;i++) {
				System.out.println(array[i]);
	}
}
		public Object get(int index) {
			return array[index];
		}
		public Iterable<Integer> Iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		}
		
