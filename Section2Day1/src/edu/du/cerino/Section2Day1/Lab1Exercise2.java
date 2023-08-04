package edu.du.cerino.Section2Day1;

public class Lab1Exercise2 {

	public static void main(String[] args) 
	{
		StdDraw.setCanvasSize(800,100);
		StdDraw.setXscale(0,8);
		StdDraw.setYscale(0,1);
		StdDraw.setPenColor(100,100,100);
		int i;
		int [] randomNumber = new int [8];
		for(i=0; i<8;i++)
		{
			randomNumber [i] =(int) (Math.random()*2.0);
			if(randomNumber[i]==0)
			{
				StdDraw.filledCircle(i+0.5, 0.5, 0.5);
			}
			else
			{
				StdDraw.filledSquare(i+0.5, 0.5, 0.5);
			}
		}
		
	}

}
