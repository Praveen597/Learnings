package com.learnings.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Result2 {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String str1, String str2) {
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        
        Arrays.sort(char1);
        Arrays.sort(char2);
        
        int counter =0; 
        
        for(int i=0; i<char1.length; i++){
         System.out.println(char1[i]);
         System.out.println(char2[i]);
        	if(char1[i] != char2[i]){
                counter = counter +2;
            }
        }

        return counter;
    
    }
}

public class AnagramRemovalCount {
	
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String a = bufferedReader.readLine();
//
//        String b = bufferedReader.readLine();
        
        String a = "cde";
        String b = "abc";
        
        int res = Result2.makeAnagram(a, b);
System.out.println(res);
        
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}


