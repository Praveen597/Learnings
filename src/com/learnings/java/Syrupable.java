package com.learnings.java;

interface Syrupable { 
	 void getSugary(); 
	}
	abstract class Pancake implements Syrupable { } 
	 
	class BlueBerryPancake implements Pancake { 
	    public void getSugary() { ; } 
	} 
	class SourdoughBlueBerryPancake extends BlueBerryPancake { 
	     void getSugary(int s) { ; } 
	}
