package com.learnings.java;

public class A {

	public static void main(String[] args) {

//			String a = "Praveen";
			
			String a = new String("Praveen");
			
			int b=10;

			test1(a);
			test2(b);

			System.out.println(a);
			System.out.println(b);


	}

	private static void test2(int a) {
		a = 20;
	}

	private static void test1(String a) {
		a = "Kumar";
		
	}

}
