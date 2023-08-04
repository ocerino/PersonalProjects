package edu.du.cerino.Lab15;

import java.util.*;

public class Art {
	private String artpiece;
	private String artist;
	private ArrayList<String> tags;
	
	public Art(String p, String a)
	{
		this.artpiece = p;
		this.artist = a;
		tags = new ArrayList<String>(5);
	}

	public String getName() 
	{
		return artpiece;
	}

	public String getArtist() 
	{
		return artist;
	}

	public void addTag(String t)
	{
		tags.add(t);
	}
	
	public boolean matches(String t)
	{
		for(String s: tags)
		{
			if(s.equals(t))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
		
	}

}
