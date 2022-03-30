package com.testyantra.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Long> map = new HashMap<>();

		map.put("mukil", 6383486717l);
		map.put("ravi", 611113486717l);
		map.put("ram", 6223486717l);
		map.put("ram", null);
		Set<String> keySet = map.keySet();

		Set<Entry<String, Long>> entrySet = map.entrySet();
		Iterator<Entry<String, Long>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Set<String> keySet1 = map.keySet();
		 for (String name:keySet1) {
		System.out.println(name);
		 }
		for (String name1 : keySet1) {
			System.out.println(map.get(name1));

		}
	}
}
