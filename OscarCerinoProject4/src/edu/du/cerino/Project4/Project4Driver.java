package edu.du.cerino.Project4;

import java.io.*;
import java.util.Scanner;

public class Project4Driver {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name of the file");
		String file = input.nextLine();
		try
		{
			
			RandomAccessFile fileStream = new RandomAccessFile(file, "rw");
			System.out.println("Would you like to encode or decode a message?");
			String answer = input.nextLine();
			
			if(answer.equals("encode"))
			{
				//encodes message
				System.out.print("Please enter your message");
				String message = input.nextLine();
				Steganography.encodeMessage(new File(file), new File("newFile.wav"), message);
			}
			else if( answer.equals("decode"))
			{
				//decodes message
				System.out.println(Steganography.decodeMessage(new File(file)));
			}
			else
			{
				System.out.println("Please type encode or decode");
			}
			fileStream.close();
			input.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
