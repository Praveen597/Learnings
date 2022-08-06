package com.learnings.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {

		String str = "seeiwiss";
		
		Map<Character, Integer> map = new LinkedHashMap<>(); 
		//Linked hashmap will store the insertion order
		
		
		int count = 1;
		for(int i=0; i<str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), count);
			}else {
				map.put(str.charAt(i), (map.get(str.charAt(i))) + 1);
			}
		}
		for(Entry<Character, Integer> c : map.entrySet()) {
			if(c.getValue() == 1) {
				System.out.println("The first non repetative character :: "+c.getKey().toString());
				break;
			}
		}
	}
}