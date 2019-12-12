package com.gul.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapKeyList {

	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();

		List<String> fruits = new ArrayList<>();
		List<String> veg = new ArrayList<>();
		List<String> animal = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		veg.add("Potato");
		veg.add("Onion");
		veg.add("carrot");
		animal.add("Cat");
		animal.add("Dog");
		map.put("fruits", fruits);
		map.put("veg", veg);
		map.put("animal", animal);
		for (Map.Entry<String, List<String>> mm : map.entrySet()) {
			System.out.println(mm.getKey() + " : " + mm.getValue());
		}

		for (Map.Entry<String, List<String>> mm : map.entrySet()) {
			if (mm.getKey().equals("fruits")) {
				mm.getValue().add("Orange");
			}
		}
		ConcurrentHashMap<String, List<String>> map2 = new ConcurrentHashMap<String, List<String>>();

		List<String> fruits2 = new ArrayList<>();
		fruits2.add("Mango");
		fruits2.add("Papaya");
		map2.put("fruits", fruits2);
		System.out.println("1: "+map2);
		for (Map.Entry<String, List<String>> mm : map.entrySet()) {

			for (Map.Entry<String, List<String>> mm2 : map2.entrySet()) {
				if(mm.getKey().equals(mm2.getKey())) {
					mm2.getValue().add(mm.getValue().get(0));
				}else {
					map2.put(mm.getKey(), mm.getValue());
				}
			}
		}

		System.out.println(map);
		System.out.println("2: "+map2);
	}
}
