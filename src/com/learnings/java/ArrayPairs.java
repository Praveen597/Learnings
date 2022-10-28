package com.learnings.java;

import java.util.HashMap;

public class ArrayPairs {

	public static void main(String args[]) {

		int a[] = {1,1,2,2};
		boolean s = false;;
		try {
			s = solution(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ans :: "+s);
	}





	public static boolean solution(int[] A) { 
		boolean resultFlag = false;

		HashMap<Integer, Integer> hmap = new HashMap<>();
		for(int i=0; i<A.length;i++) {
			if(hmap.containsKey(A[i])) {
				hmap.put(A[i], (hmap.get(A[i]) + 1));
			}else {
				hmap.put(A[i], 1);
			}
		}
		for(Integer x : hmap.keySet()){
			System.out.println( x + " === " + hmap.get(x));
			if( hmap.get(x) !=2) {
				return false;
			}
		}
		return true;
	}

}
