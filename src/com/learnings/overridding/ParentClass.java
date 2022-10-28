package com.learnings.overridding;

public class ParentClass {
	//constructor with arg
    public ParentClass(int x) {
    	System.out.println("ParentClass Value == "+x);
    }
    
    //constructor
    public ParentClass() {
    	System.out.println("ParentClass with no ARGS");
    }
    
    //non-constructor method
    public void NonConstructor(int y) {
    	System.out.println("nonConstructor from ParentClass Value == "+y);
    }
}