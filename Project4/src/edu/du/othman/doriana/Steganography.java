package edu.du.othman.doriana;

import java.io.*;
import java.nio.file.Files;

public class Steganography
{
	public static String decodeMessage(File inputFile) throws SecretMessageException
	{
		String message = "";
		try
		{
			RandomAccessFile fileStream = new RandomAccessFile(inputFile, "r");
			fileStream.seek(50);
			int length = fileStream.readInt();
			System.out.println(length);
			long location=0;
			for(int i =0; i<length; i++)
			{
				message+=fileStream.readChar();
				location = fileStream.readLong();
				fileStream.seek(location);
				System.out.println(message);
			}
			fileStream.close();
			return message;
		}
		catch(IOException e)
		{
			throw new SecretMessageException(e.getMessage());
		
		}
		
	}
	
	public static void encodeMessage(File inputFile, File outputFile, String message) throws NotEnoughSpaceException, SecretMessageException
	{
		try
		{
			RandomAccessFile fileStream = new RandomAccessFile(outputFile, "rw");
			Files.copy(inputFile.toPath(), new FileOutputStream(outputFile));
			fileStream.seek(50);
			fileStream.writeInt(message.length());
			long[] locations = getDataLocations(54, inputFile.length(), message.length());
			
			for(int i = 0; i < message.length(); i++)
			{
				fileStream.writeChar(message.charAt(i));
				fileStream.writeLong(locations[i]);
				fileStream.seek(locations[i]);
			}
			fileStream.close();
		}
		catch(IOException e)
		{
			if(e.getMessage().contains("Negative seek offset"))
			{
				throw new SecretMessageException("You tried to seek too far");
			}
			else
			{
				throw new SecretMessageException(e.getMessage());
			}
			
		}
	}
	
	public static long[] getDataLocations(long start, long stop, int numLocations) throws NotEnoughSpaceException
	{
		if(stop-start < (numLocations*10))
		{
			throw new NotEnoughSpaceException(numLocations*10 -stop-start, stop-start);
		}
		long lengthMes = 10*numLocations;
		long lengthFile = stop-start;
		long space = (lengthFile-lengthMes)/(numLocations-1);
		long[] messageLoc = new long[numLocations];
		long location = start+ space + 10;
		for(int i=0; i<numLocations; i++)
		{
			messageLoc[i]= location;
			location += space+10;
		}
		return messageLoc;
		
	}

}
