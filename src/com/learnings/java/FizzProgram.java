package com.learnings.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write your code here
//    	System.out.println("Input :: "+ n);
    	for(int i=1; i<=n; i++) {
//    		System.out.println(" ******* i value = " + i);
    		if(i%3 == 0 && i%5  == 0) {
    			System.out.println("FizzBuzz");
    		}
    		if(i%3 == 0 && i%5 != 0) {
    			System.out.println("Fizz");
    		}
    		if(i%3 != 0 && i%5 == 0) {
    			System.out.println("Buzz");
    		}
    		if(i%3 != 0 && i%5 != 0) {
    			System.out.println(i);
    		}
    	}
    }

}

public class FizzProgram {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());

    	int n = 65;
        Result.fizzBuzz(n);

//        bufferedReader.close();
    }
}
