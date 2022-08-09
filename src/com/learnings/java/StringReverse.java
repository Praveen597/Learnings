package com.learnings.java;

public class StringReverse {

	public static void main(String[] args) {
		String str = "java programming";
		String result = "";
		
		// #1 : Using Stringbuffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Using String buffer :: " +sb.reverse());
		result = sb.reverse().toString();

		// #2 : without String buffer
		result = "";
		for(int i=str.length(); i>0; i--) {
//			System.out.println(str.charAt(i-1));
			result = result + str.charAt(i-1);
		}
		System.out.println("with out string buffer :: "+result);
	
		
		
		
		
		if(sb.reverse().toString().equals(sb)) {
			System.out.println("The given string is "+ sb + " :: is pallindrome");
		}else {
			System.out.println("************** Not a pallindrome ************");
		}
		
		
		
	}
}