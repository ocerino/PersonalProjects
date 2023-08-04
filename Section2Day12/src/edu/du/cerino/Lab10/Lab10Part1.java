package edu.du.cerino.Lab10;

import java.io.*;
import java.util.Scanner;

public class Lab10Part1 {

	public static void main(String[] args) {
		String advice;
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileInputStream("advice.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);			
		}
		advice = inputStream.nextLine();
		System.out.println("My advice is: " + advice + "!");
		inputStream.close();
		
		
		Scanner keyboard = new Scanner(System.in);
		PrintWriter outputStream=null;

		System.out.println("What is your advice?");
		advice = keyboard.nextLine();
		try {
			outputStream = new PrintWriter(new FileOutputStream("advice.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.println("Your advice is: " + advice + "! " + "Saving your advice to the file \"advice.txt\".");
		outputStream.println(advice);
		outputStream.close();
		keyboard.close();
	}

}
