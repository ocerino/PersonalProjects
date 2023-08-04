package edu.du.cerino.Lab12;

import java.util.Scanner;
import java.io.*;

public class Lab12Driver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String fileName;
		System.out.print("Enter file name: ");
		fileName = keyboard.next();
		keyboard.close();
		int numNumbers;
		int[] numArray;
		try {
			
			RandomAccessFile inputStream = new RandomAccessFile(new File(fileName), "rw");
			numNumbers = inputStream.readInt();
			System.out.println("Number of numbers: " + numNumbers);
			numArray = new int [numNumbers];
			for(int i=0;i<numNumbers;i++)
			{
				numArray[i] = inputStream.readInt();
			}
			sort(numArray);
			inputStream.seek(4);
			for(int i=0;i<numNumbers;i++)
			{
				inputStream.writeInt(numArray[i]);
			}
			inputStream.close();
		}
		catch (IOException e) {
			System.out.println("IO failure: ");
			System.out.println(e.getMessage());
		}	
		
		
		try {
			
			RandomAccessFile inputStream = new RandomAccessFile(new File(fileName), "r");
			numNumbers = inputStream.readInt();
			System.out.println("Number of numbers: " + numNumbers);
			int count = 0;
			for (int i=0; i < numNumbers; i++) {
				System.out.print(inputStream.readInt() + " ");
				count++;
				if (count % 20 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			inputStream.close();
		}
		catch (IOException e) {
			System.out.println("IO failure: ");
			System.out.println(e.getMessage());
		}	


	}

	public static void sort(int[] numArray) {
		
		int temp;
		for (int i = 0; i < numArray.length-1; i++) {
			for (int j = 0; j < numArray.length - i - 1; j++) {
				if (numArray[j] > numArray[j + 1]) {
					/* swap 'em */
					temp = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = temp;
				}
			}
		}
		
	}

}
