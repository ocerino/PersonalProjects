package edu.du.cerino.Lab3;
//Name: Robert Real and Oscar Cerino
//Date: Jan 14, 2019

public class HotDogStand {

	private String hotDogStandName;
	private int uniqueID;
	private static int lastIDassigned = 1;
	private int numberOfHotDogsSold;
	private static int totalNumberOfHotDogsSold;
	
	
	public HotDogStand(String standName)
	{
		this.hotDogStandName = standName;
		this.uniqueID = nextID();
		this.numberOfHotDogsSold = 0;
	}
	
	
	private int nextID()
	{
		return lastIDassigned++;
	}
	
	public static int totalHotDogsSold()
	{
		return totalNumberOfHotDogsSold;
	}

	public int justSold()
	{
		totalNumberOfHotDogsSold++;
		return this.numberOfHotDogsSold++;
	}
	
	public String getStandName()
	{
		return this.hotDogStandName;
	
	}
	
	public int getUniqueID()
	{
		return this.uniqueID; 
	}
	
	public int getNumberOfHotDogsSold() 
	{
		return this.numberOfHotDogsSold;
	}
}
