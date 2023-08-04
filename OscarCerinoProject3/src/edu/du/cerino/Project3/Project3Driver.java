package edu.du.cerino.Project3;

import java.util.Scanner;
import java.io.*;

public class Project3Driver {

	public static void main(String[] args) {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new FileInputStream("Emoji.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);			
		}
		int yScale = inputStream.nextInt();
		int xScale = inputStream.nextInt();
		StdDraw.setCanvasSize(xScale*100, yScale*100);
		StdDraw.setXscale(0, xScale);
		StdDraw.setYscale(0, yScale);
		
		Emoji [][] emojis = new Emoji [yScale] [xScale];
		
		for(int i=0;i<yScale;i++)
		{
			for(int j=0;j<xScale;j++)
			{
				
				String emojiType = inputStream.next();
				if(emojiType.equals("smile"))
				{
					emojis [i] [j] = new SmileyFaceEmoji(j+0.5,i+0.5,0.5);
					emojis [i] [j].draw();
				}
				else if(emojiType.equals("surprise"))
				{
					emojis [i] [j] = new SurprisedFaceEmoji(j+0.5,i+0.5,0.5);
					emojis [i] [j].draw();
				}
				else if(emojiType.equals("clock"))
				{
					int hour=inputStream.nextInt();
					emojis [i] [j] = new ClockEmoji(j+0.5,i+0.5,0.5,hour);
					emojis [i] [j].draw();
				}
					
			}
		}
	}

}
