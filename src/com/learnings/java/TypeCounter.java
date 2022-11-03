package com.learnings.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Results {

	/*
	 * Complete the 'typeCounter' function below.
	 *
	 * The function accepts STRING sentence as parameter.
	 */

	public static void typeCounter(String sentence) {

		int countInt = 0;
		int countString = 0;
		int countFloat = 0;
		int countDouble = 0;

		for(int i=0; i<sentence.split(" ").length ; i++){
			//            String dataType = ((Object)sentence.split(" ")[i]).getClass().getSimpleName();

			String dataType = sentence.split(" ")[i];

			try {
				Integer.parseInt(dataType);
				countInt = countInt+1;
			}catch(NumberFormatException e) {
				try {
					Double.parseDouble(dataType);
					countDouble = countDouble +1;
				}catch(NumberFormatException e2) {
					countString = countString +1;
				}
			}
			
			
			
			
			
			
//			try {
//				Double.parseDouble(dataType);
//				countDouble = countDouble +1;
//			}catch(NumberFormatException e) {
//				try {
//					Float.parseFloat(dataType);
//					countFloat = countFloat +1;
//				}catch(NumberFormatException e2) {
//					try {
//						Integer.parseInt(dataType);
//						countInt = countInt+1;
//					}
//					catch(NumberFormatException e3) {
//						countString = countString +1;
//						System.out.println("Exp :: "+e3.getMessage());
//					}
//
//				}
//			}
		}
		
		
		
		System.out.println("string ::"+countString);
		System.out.println("integer :: "+countInt);
		System.out.println("double :: "+countDouble);
//		System.out.println("countFloat :: "+countFloat);
		
	}

}

public class TypeCounter {
	public static void main(String[] args) throws IOException {
		//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		//        String sentence = bufferedReader.readLine();

		Results.typeCounter("give me 10 dollars");

		//        bufferedReader.close();
	}
}
