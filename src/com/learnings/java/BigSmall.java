package com.learnings.java;

public class BigSmall {

	public static void main(String args[]) {
		
		
		int[] a = {2,55,3,77,8};
		
		int result = solution(a);
		
		
	}

	private static int solution(int[] a) {
		int res = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=(i+1); j<a.length; j++) {
				int temp =0;
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]); 
		}
		
		System.out.println("Big Number == "+a[a.length-1]);
		System.out.println("Smallest number == "+a[0]);
		return res;
	}
}
