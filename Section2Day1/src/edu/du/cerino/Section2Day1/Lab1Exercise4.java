package edu.du.cerino.Section2Day1;

public class Lab1Exercise4 
{
	public static final int numColumns = 5;
	public static final int numRows = 8;
	
	public static void main(String[] args) 
	{
		StdDraw.setCanvasSize(numColumns *100,numRows*100);
		StdDraw.setXscale(0,numColumns);
		StdDraw.setYscale(0,numRows);
		double [] [] colorSetter = new double [numRows] [numColumns];
		for(int i =0;i<numColumns; i++)
		{
			for(int j = 0; j<numRows;j++)
			{ 
				colorSetter [j] [i] = Math.random();
				if(colorSetter [j] [i] >=0 && colorSetter [j] [i]<0.25 )
				{
					StdDraw.setPenColor(255,0,0);
					
				}
				else if(colorSetter [j] [i]>=0.25 && colorSetter [j] [i]<0.5)
				{
					StdDraw.setPenColor(0,0,255);
				}
				else if(colorSetter [j] [i]>=0.5 && colorSetter [j] [i]<0.75)
				{
					StdDraw.setPenColor(0,255,0);
				}
				else
				{
					StdDraw.setPenColor(100,100,100);
				}
				StdDraw.filledCircle(4.5-i, 7.5-j, 0.5);
			}
		}
	}

}
