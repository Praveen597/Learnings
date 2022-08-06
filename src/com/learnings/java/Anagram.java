package com.learnings.java;

import java.util.Arrays;

public class Anagram {

	public static void main(String args[]) {
		
		String str1 = "dog";
		String str2 = "god";
		
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		if(Arrays.equals(char1, char2)) {
			System.out.println("The given strings are ANAGRAM");
		}else {
			System.out.println("The given strings are NOT ANAGRAM");
		}
		
	}
}
