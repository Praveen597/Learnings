package com.learnings.java;

//public class AA {
//
//	public static void main(String[] args) {
//		try 
//		{
//		    Float f1 = new Float("3.0");
//		    int x = f1.intValue();
//		    byte b = f1.byteValue();
//		    double d = f1.doubleValue();
//		    System.out.println(x + b + d);
//		    System.out.println(x);
//		    System.out.println(b);
//		    System.out.println(d);
//		}
//		catch (NumberFormatException e) /* Line 9 */
//		{
//		    System.out.println("bad number"); /* Line 11 */
//		}
//	}
//
//}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Result {
	public static int makeAnagram(String str1, String str2) {
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);

		int counter =0; 

		for(int i=0; i<char1.length; i++){
			if(char1.toString().charAt(i) != char2.toString().charAt(i)){
				counter = counter +1;
			}
		}
		System.out.println(counter);
	}
}
	public class Solution {
		public static void main(String[] args) throws IOException {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

			String a = bufferedReader.readLine();

			String b = bufferedReader.readLine();

			int res = Result.makeAnagram(a, b);

			bufferedWriter.write(String.valueOf(res));
			bufferedWriter.newLine();

			bufferedReader.close();
			bufferedWriter.close();
		}
	}

