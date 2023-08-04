package edu.du.cerino.Lab3;
//Name: Robert Real and Oscar Cerino
//Date: Jan 14, 2019

public class HotDogStandDriver {

	public static void main(String[] args) {
		HotDogStand echo1 = new HotDogStand("Denver1");
		HotDogStand echo2 = new HotDogStand("Denver2");
		
		for(int i=0;i<7;i++)
		{
			echo1.justSold();
		}
		
		for(int i=0;i<17;i++)
		{
			echo2.justSold();
		}
		
		System.out.println("Stand Name	Stand ID 	# Sold");
		System.out.println(echo1.getStandName() +  "		" + echo1.getUniqueID() + "		" + echo1.getNumberOfHotDogsSold());
		System.out.println(echo2.getStandName() +  "		" + echo2.getUniqueID() + "		" + echo2.getNumberOfHotDogsSold());
		System.out.println("Total number of hot dogs sold: " + HotDogStand.totalHotDogsSold());
		
	}

}
