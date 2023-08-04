package edu.du.cerino.Lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab10Part2 {

	public static void main(String[] args) {
		String advice;
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileInputStream("advice2.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);			
		}
		advice = inputStream.nextLine();
		while(inputStream.hasNextLine())
		{
		advice = inputStream.nextLine();
		}
		System.out.println("My advice is: " + advice + "!");
		inputStream.close();
		
		
		Scanner keyboard = new Scanner(System.in);
		PrintWriter outputStream=null;

		System.out.println("What is your advice?");
		
		advice = keyboard.nextLine();
		try {
			outputStream = new PrintWriter(new FileOutputStream("advice2.txt", true));
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.println("Your advice is: " + advice + "! " + "Saving your advice to the file \"advice2.txt\".");
		outputStream.println(advice);
		outputStream.close();
		keyboard.close();
	}

}
