package edu.du.cerino.Day2;
import java.util.*;

public class Lab2Exercise1 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		int arraySize = -1;
		int maxSize = -1;
		int[] userArray;
		do
		{
			System.out.println("How big would you like your array to be?");
			if(kb.hasNextInt())
			{
				arraySize = kb.nextInt();
				if(arraySize<0)
				{
					System.out.println("The array size must be positive");
				}
				else
				{
					System.out.println("Your array size is " + arraySize);
				}
			}
			else
			{
				System.out.println("That is not a valid array size");
				kb.nextLine();
			}
		}while(arraySize<0);
		do
		{
			System.out.println("What is the max number you want your array to go to?");
			if(kb.hasNextInt())
			{
				maxSize = kb.nextInt();
				if(maxSize<0)
				{
					System.out.println("The max number must be positive");
				}
				else
				{
					System.out.println("The max number of the array is " + maxSize);
				}
			}
			else
			{
				System.out.println("That is not a valid max size");
				kb.nextLine();
			}
		}while(maxSize<0);
		userArray = new int [arraySize];
		for(int i = 0;i < arraySize;i++)
		{
			userArray[i]=(int) (Math.random()*(maxSize-1)+1);
			System.out.print(userArray[i]+"; ");
		}
		int temp;
		int csIndex;
		int total = 0;
		System.out.println();
		for(int i = 0; i< userArray.length;i++)
		{
			csIndex = i;
			for(int j = i +1; j < userArray.length;j++)
			{
				if(userArray[j]<userArray[csIndex])
				{
					
					csIndex = j;
				}
			}
			if(csIndex != i)
			{
				temp = userArray[i];
				userArray[i] = userArray[csIndex];
				userArray[csIndex] = temp;
				total += csIndex-i;
			}
			System.out.print(userArray[i]+"; ");
		}
		System.out.println("\nThe amount of positions swapped was "+ total);
	}

}
