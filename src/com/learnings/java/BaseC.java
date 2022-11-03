package com.learnings.java;

//interface BaseI { void method(); }
//
//class BaseC
//{
//   public void method()
//   {
//      System.out.println("Inside BaseC::method");
//   }
//}
//
//class ImplC extends BaseC implements BaseI
//{
//   public static void main(String []s)
//   {
//      (new ImplC()).method();
//   }
//}


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