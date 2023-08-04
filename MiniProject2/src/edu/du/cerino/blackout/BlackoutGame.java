package edu.du.cerino.blackout;


import java.util.Scanner;

public class BlackoutGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int rows, columns; // this will be the size of the array of windows
		
		System.out.println("Please enter the number of rows, followed by the number of columns: ");
		rows = -1;
		do
		{
			if(keyboard.hasNextInt())
			{
				rows = keyboard.nextInt();
				if(rows<0)
				{
					System.out.println("The row size must be positive. Please enter your number again");
				}
			}
			else
			{
				System.out.println("That is not a valid row size. Please enter a valid row size");
				keyboard.nextLine();
			}
		}while(rows<0);
		
		columns = -1;
		do
		{
			if(keyboard.hasNextInt())
			{
				columns = keyboard.nextInt();
				if(columns<0)
				{
					System.out.println("The column size must be positive. Please enter your number again");
				}
			}
			else
			{
				System.out.println("That is not a valid column size");
				keyboard.nextLine();
			}
		}while(columns<0);
		
		BlackoutGameboard bg = new BlackoutGameboard(rows, columns);
		bg.draw();

		StdDraw.enableDoubleBuffering();
		while (!bg.allOff() && !bg.allOn()) {
			if (StdDraw.isMousePressed()) {
				bg.clickLight(StdDraw.mouseX(),StdDraw.mouseY());
				/*
				 * Bug found below was BlackoutGameboard.draw() which was calling the draw method and having the class it is in run it when it should be the object of type BlackoutGameboard calling it.
				 * I just changed it to bg.draw()
				*/
				bg.draw();
				StdDraw.show();
				
			}

			StdDraw.pause(150);
		}
		// The game is over: give a message to the user
		if (bg.allOff()) {
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.text(rows/2.0, columns/2.0, "You win! Blackout!");
		} else if (bg.allOn()) {
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(rows/2.0, columns/2.0, "You lose! All the lights are on!");
		}
		StdDraw.show();
		keyboard.close();
			
	}

}
