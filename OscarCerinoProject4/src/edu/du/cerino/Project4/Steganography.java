package edu.du.cerino.Project4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Steganography {

	public static String decodeMessage(File inputFile) throws SecretMessageException {
		char [] messageLetters;
		RandomAccessFile fileStream = null;
		try {
			fileStream = new RandomAccessFile(inputFile, "r");
			fileStream.seek(50);
			int length = fileStream.readInt();
			messageLetters = new char [length];
			long distance = 0;
			for(int i=0; i<length;i++)
			{
				messageLetters [i] = fileStream.readChar();
				distance = fileStream.readLong();
				fileStream.seek(distance);
			}
			
			String message = new String(messageLetters);
			fileStream.close();
			return message;
		} catch (IOException e) {
			if (e.getMessage().contains("The system cannot find the file specified")) 
			{
				throw new SecretMessageException("Your file can't be found!");
			} else if(e.getMessage().contains("Negative seek offset")) 
			{
				throw new SecretMessageException("You tried to seek to far!");
			}
			else
			{
				throw new SecretMessageException(e.getMessage());
			}

		}
	}

	public static void encodeMessage(File inputFile, File outputFile, String message) throws NotEnoughSpaceException, SecretMessageException 
	{
		RandomAccessFile input = null;
		RandomAccessFile output = null;
		FileOutputStream out = null;
		
		try {
			input = new RandomAccessFile(inputFile,"r");
			output = new RandomAccessFile(outputFile, "rw");
			out = new FileOutputStream(outputFile);
			Files.copy(inputFile.toPath() , out);
			long [] pos = getDataLocations(54,input.length(),message.length());
			output.seek(50);
			output.writeInt(message.length());
			for(int i =0; i <message.length(); i ++)
			{
				output.writeChar(message.charAt(i));
				output.writeLong(pos[i]);
				output.seek(pos[i]);
			}
			input.close();
			output.close();
			out.close();
		} catch (IOException e) {
			if (e.getMessage().contains("The system cannot find the file specified")) 
			{
				throw new SecretMessageException("Your file can't be found!");
			}
			else if(e.getMessage().contains("Negative seek offset"))
			{
				throw new SecretMessageException("You tried to seek too far!");
			}
			else
			{
				throw new SecretMessageException(e.getMessage());
			}
		}
		catch(NotEnoughSpaceException e)
		{
			throw new NotEnoughSpaceException(message.length()*10 - inputFile.length()-54, inputFile.length()-54);
		}
	}

	public static long[] getDataLocations(long start, long stop, int numLocations) throws NotEnoughSpaceException 
	{
		if(stop-start < (numLocations*10))
		{
			throw new NotEnoughSpaceException(numLocations*10 -stop-start, stop-start);
		}
		long messageLength = 10*numLocations;
		long fileLength = stop-start;
		long space = (fileLength-messageLength)/(numLocations-1);
		long[] messageLocations = new long[numLocations];
		long location = start+ space + 10;
		for(int i=0; i<numLocations; i++)
		{
			messageLocations[i]= location;
			location += space+10;
		}
		return messageLocations;
	}

}
