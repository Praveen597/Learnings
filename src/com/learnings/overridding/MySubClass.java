package com.learnings.overridding;

public class MySubClass extends ParentClass {
	public MySubClass(int a, int b) {
		
		
		this(a);
		System.out.println(a);
		System.out.println(b);
		
		NonConstructor(a+b);
		
		this.NonConstructor(a+1, b+1);
	}
	
	
	public MySubClass(int a) {
		System.out.println("My SubClass == "+a);
	}



	static void NonConstructor(int a, int b){
		System.out.println("NonConstructor Child Class Result  == " + (a+b));
	}
}