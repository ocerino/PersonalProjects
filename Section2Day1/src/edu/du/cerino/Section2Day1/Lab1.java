package edu.du.cerino.Section2Day1;

public class Lab1 
{

	public static void main(String[] args) 
	{
		StdDraw.setCanvasSize(500,500);
		StdDraw.setXscale(0,5);
		StdDraw.setYscale(0,5);
		StdDraw.setPenColor(100,100,100);
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				StdDraw.filledCircle(4.5-i,j+0.5, 0.5);
			}
		}
		

	}

}
