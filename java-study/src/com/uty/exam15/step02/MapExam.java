package com.uty.exam15.step02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExam {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("국어", 90);
		map.put("영어", 80);
		map.put("수학", 95);
		map.put("과학", 100);

		System.out.println("총 Entry: " + map.size());
		System.out.println("국어점수: " + map.get("국어"));

		System.out.println();

		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}
		System.out.println();

		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}
		System.out.println();

		List<String> list = new ArrayList<>();

		list.add("java");
		list.add("c++");
		list.add("Python");
		list.add("c#");
		list.add("Objective-c");

		Iterator<String> listIterator = list.iterator();
		while (listIterator.hasNext()) {
			String element = listIterator.next();
			System.out.println(element);
		}

		map.remove("국어");
		System.out.println("총 Entry: " + map.size());
		System.out.println();
		// ====================================================

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		System.out.println();

		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry: " + map.size());
	}
}
