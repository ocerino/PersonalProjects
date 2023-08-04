package edu.du.cerino.Section2Day1;

public class Lab1Exercise3 
{
	public static final int numColumns = 5;
	public static final int numRows = 8;
	
	public static void main(String[] args)
	{
		StdDraw.setCanvasSize(numColumns *100,numRows*100);
		StdDraw.setXscale(0,numColumns);
		StdDraw.setYscale(0,numRows);
		StdDraw.setPenColor(100,100,100);
		boolean [][] onOrOff = new boolean [numRows] [numColumns];
		for(int i =0;i<numColumns; i++)
		{
			for(int j = 0; j<numRows;j++)
			{ 
				onOrOff [j] [i] = Math.random()<0.5;
				if(onOrOff [j] [i] == true)
				{
					StdDraw.filledCircle(4.5-i, 7.5-j, 0.5);
				}
			}
		}
		
	}

}
