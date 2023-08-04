package edu.du.cerino.Lab15;
import java.util.*;

public class Gallery {
	private ArrayList<Art> artwork;
	
	public Gallery()
	{
		artwork = new ArrayList<Art>(5);
	}
	
	public void addPiece(Art a) 
	{
		artwork.add(a);
	}
	
	public void printCollection()
	{
		for(Art a : artwork)
		{
			System.out.println(a.getName()+", " + a.getArtist());
		}
	}
	
	public int numberBy(String artist)
	{
		int count=0;
		for(Art a : artwork)
		{
			if(artist.equals(a.getArtist()))
			{
				count++;
			}
		}
		return count;
	}
	
	public int numberMatching(String tag)
	{
		int count=0;
		for(Art a : artwork)
		{
			if(a.matches(tag))
			{
				count++;
			}
		}
		return count;
	}
}
