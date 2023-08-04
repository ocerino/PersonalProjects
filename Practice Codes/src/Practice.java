import java.util.Scanner;

public class Practice 
{
	
	public static void main(String[] args) 
	{
		int[] a = new int[5];
		int temp, k;
		for(k=0;k<a.length;k++)
		{
			a[k]=k;
			System.out.print(a[k] + ", ");
		}
		System.out.println();
		for(k=0;k<a.length/2;k++)
		{
			temp=a[k];
			a[k]=a[(a.length-1)-k];
			a[(a.length-1)-k]=temp;
			System.out.print(a[k]+ ", ");
		}
		
		
		int xPosition, yPosition;
		int width = 200;
		int height = 200;
		int count = 0;
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);

		StdDraw.enableDoubleBuffering();
		for (int i = 0; i < 5000; i++)
		{
			xPosition = (int) (Math.random() * width);
			yPosition = (int) (Math.random() * height);

			if (xPosition >= yPosition && xPosition < width / 2) {
				StdDraw.setPenColor(0, 255, 255);
			} else if (xPosition > yPosition && xPosition >= width / 2) {
				StdDraw.setPenColor(255, 0, 255);}
			else if (xPosition < yPosition && xPosition < width / 2) {
				StdDraw.setPenColor(255, 255, 0);
			} else if (xPosition <= yPosition && xPosition >= width / 2) {
					StdDraw.setPenColor(0, 100, 100); }
			
			StdDraw.filledCircle(xPosition, yPosition, 5);

			StdDraw.show();
			StdDraw.pause(5);
			count++;
		}

		int [] test = new int [5];
		
		for(int i=0;i<test.length;i++)
		{
			test[i] = (int)(Math.random()*9);
			System.out.println(test[i]);
		}
		System.out.println(allUnique(test));
		System.out.println("The minimum value in the array is: "+arrayMinimum(test));
		
	}
	
	public static boolean allUnique(int[] input)
	{
		for(int i = 0;i<input.length;i++)
		{
			for(int j = i+1;j<input.length;j++)
			{		
				if(input[i]==input[j])
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static int arrayMinimum(int[] input)
	{ 
		int minimum = input[0]; 
		for (int i = 1; i < input.length; i++) 
		{
			if (input[i] < minimum)
			{ 
				minimum = input[i]; 
			}
		}
		return minimum;
	}
}
