package com.learnings.java;

import java.util.ArrayList;
import java.util.Collections;

public class Binary {
	public static void main(String args[]) {

		int N = 32;
		

		int s = solution(N);
		System.out.println("Ans :: "+s);
	}

	private static int solution(int N) {
		String bin = Integer.toBinaryString(N);
		System.out.println(bin);
		bin = "1001";
		String s[] = bin.split("1");
		System.out.println(s.length);
		if(s.length < 3) {
			return 0;
		}
		
//		int ans[] = new int[s.length];
		
//		for(int i=0; i< s.length; i++) {
//			ans[i] = s[i].length();
//		}
		
		ArrayList<Integer> intArray = new ArrayList<>();
        for(int i=0; i<s.length;i++) {
        	intArray.add(s[i].length());
        }
        
        Collections.sort(intArray);
        
//        System.out.println(intArray.get(intArray.size()-1));
		
        if(intArray.size() == 0) {
        	return 0;
        }else {
        	return intArray.get(intArray.size()-1);	
        }
        
		
		
	}
}
