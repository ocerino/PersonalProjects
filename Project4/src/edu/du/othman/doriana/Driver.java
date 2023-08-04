package edu.du.othman.doriana;

import java.io.*;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) 
	{
		try
		{
			String file = "";
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter file name");
			file= input.nextLine();
			RandomAccessFile fileStream = new RandomAccessFile(file, "rw");
			System.out.println("Would you like to encode or decode?");
			String answer = input.nextLine();
			
			if(answer.equals("encode"))
			{
				//encode
				System.out.print("Please enter your message");
				String message = input.nextLine();
				RandomAccessFile fileStream2 = new RandomAccessFile("newFile", "rw");
				Steganography.encodeMessage(new File(file), new File("newFile"), message);
			}
			else if( answer.equals("decode"))
			{
				//decode
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
