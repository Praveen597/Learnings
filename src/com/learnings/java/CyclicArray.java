package com.learnings.java;

public class CyclicArray {

	public static void main(String[] args) {
		int a[] = {1, 3, 6, 4, 2};
		int k =3;
		try {
			int s[] = solution(a, k);
			for(int j=0;j<s.length; j++) {
				System.out.println(s[j]);
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}

	private static int[] solution(int[] a, int k) {

		int aLen = a.length;
//		System.out.println("Array length == "+aLen);
		int dump[] = new int[aLen];
		int count =0;
		while(k!=0) {
//			System.out.println("Value of K == "+k);
//			System.out.println("***** ITERATION :: " + (count+1));
			for(int i=0; i<a.length; i++) {
//				System.out.println("Before Shifting");
//				System.out.println("Dump of "+i + " == " +dump[i]);
//				System.out.println("Array of "+i + " == " +a[i]);
				
//				System.out.println();
				
				if(i == a.length-1) {
					dump[0] = a[i];
					break;
				}
//				System.out.println();
				dump[i+1] = a[i];
				
//				System.out.println("After Shifting");
//				System.out.println("Dump of "+i + " == " +dump[i+1]);
//				System.out.println("Array of "+i + " == " +a[i]);
				
			}
			k = k-1;
			if(k!=0) {
				for(int j=0;j<dump.length; j++) {
					a[j] = dump[j];
					dump[j] = 0;
				}	
			}
		}
		
//		System.out.println();
		
		
		
		return dump;
	}
}

	