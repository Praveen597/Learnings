package com.learnings.overridding;

//Java program to demonstrate
//method Hiding in java

//Base Class
class Complex {
	public static void f1()
	{
		System.out.println("f1 method of the Complex class is executed.");
	}
}

//class child extend Complex class
class Sample extends Complex {
	public static void f1()
	{
		System.out.println("f1 of the Sample class is executed.");
	}
}
public class MethodHiding {

	public static void main(String args[])
	{
		Complex d1 = new Complex();

		// d2 is reference variable of class Complex that
		// points to object of class Sample
		Complex d2 = new Sample();

		// But here method will be call using type of
		// reference
		d1.f1();
		d2.f1();
		
		Sample d3 = new Sample();
		d3.f1();
	}
}