package com.testyantra.assignment;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;

	public class Mainn {
		public static void main(String[] args) {
			CompareToInString Dinesh = new CompareToInString(3, "Dinesh", "Trainee", 60000);
			CompareToInString Gokul = new CompareToInString(1, "Gokul", "Trainee", 35000);
			CompareToInString Nallish = new CompareToInString(2, "Nallish", "Trainee", 30000);
			CompareToInString Mukilan = new CompareToInString(5, "Mukilan", "Trainee", 40000);
			CompareToInString Naveen = new CompareToInString(4, "Naveen", "Trainee", 70000);

			ArrayList<CompareToInString> arrayList = new ArrayList<CompareToInString>();
			arrayList.add(Dinesh);
			arrayList.add(Gokul);
			arrayList.add(Nallish);
			arrayList.add(Mukilan);
			arrayList.add(Naveen);
			
			//arrayList.remove(2);
			
			Collections.sort(arrayList);
			
			Iterator<CompareToInString> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}



