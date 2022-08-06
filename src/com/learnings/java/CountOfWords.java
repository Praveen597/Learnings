package com.learnings.java;
import java.util.HashMap;

public class CountOfWords {

	public static void main(String[] args) {
		String str = "I am Learning DATA data SCIENCE";
		ignoreLowerCase(str);
		donotignoreLowerCase(str);
	}

	private static void donotignoreLowerCase(String str) {
		try {
			HashMap<String, Integer> resultMap = new HashMap<String, Integer>();
			String words[] = str.split(" ");
			for(int i=0; i<words.length; i++) {
				/*
				 * use containsKey 
				 * 
				 * */
				if(resultMap.containsKey(words[i].toLowerCase())) {
					resultMap.put(words[i].toLowerCase(), (resultMap.get(words[i].toLowerCase())+1));
				}else {
					resultMap.put(words[i].toLowerCase(), 1);
				}
			}
//			System.out.println(resultMap);
			
			for(String x : resultMap.keySet()) {
				System.out.println(x +" == "+ resultMap.get(x));
			}
		}
		catch(Exception e) {
			System.out.println("Exception caught due to :: "+ e.getMessage());
		}
		
	}

	private static void ignoreLowerCase(String str) {
		try {
			HashMap<String, Integer> resultMap = new HashMap<String, Integer>();
			String words[] = str.split(" ");
			for(int i=0; i<words.length; i++) {
				if(resultMap.containsKey(words[i].toLowerCase())) {
//					System.out.println(words[i].toLowerCase());
//					System.out.println(resultMap.get(words[i].toLowerCase()));
//					System.out.println(resultMap.get(words[i].toLowerCase() + 1));
					resultMap.put(words[i].toLowerCase(), (resultMap.get(words[i].toLowerCase())+1));
				}else {
					resultMap.put(words[i].toLowerCase(), 1);
				}
			}
//			System.out.println(resultMap); 
			
			for(String x : resultMap.keySet()) {
				System.out.println(x +" == "+ resultMap.get(x));
			}
		}
		catch(Exception e) {
			System.out.println("Exception caught due to :: "+ e.getMessage());
		}
	}

}
