package edu.du.cerino.MiniProject4;


import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.FileOutputStream;

public class BlackoutGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean userQuits= false;
		String filename;
		BlackoutGameboard bg=null;
		char inputChar=0;
		
		
		System.out.println("Please enter filename of stored game:");
		filename = keyboard.next();
		try {
			bg = new BlackoutGameboard(new Scanner(new FileInputStream(filename)));
		}
		catch (FileNotFoundException e) {
			System.out.println("File " + filename + " not found, initializing 5 by 5 grid randomly.");
			bg = new BlackoutGameboard(5,5);
		}
		bg.draw();
		
		
		
		System.out.println("Game starting. Press q to quit. Press s to save game.");

		StdDraw.enableDoubleBuffering();
		while (!bg.allOff() && !bg.allOn() &&!userQuits) {
			if (StdDraw.isMousePressed()) {
				bg.clickLight(StdDraw.mouseX(),StdDraw.mouseY());
				bg.draw();
			}
			if (StdDraw.hasNextKeyTyped()) {
				inputChar = StdDraw.nextKeyTyped();
				if (inputChar=='q' || inputChar=='s') {
					userQuits = true;
				}
			}		

			StdDraw.show();
			StdDraw.pause(150);
		}
		// The game is over: give a message to the user
		if (bg.allOff()) {
			bg.endMessage("Blackout! You win! All the lights are off."); 
		} else if (bg.allOn()) {
			bg.endMessage("You lose! All the lights are on!");
		} else if (inputChar == 'q') {
			bg.endMessage("Game is over because you quit!");
		} else if (inputChar == 's') {
			System.out.println("Enter file name where you'd like to store the game:");
			filename = keyboard.next();
			
			try {
				bg.outputGame(new PrintStream(new FileOutputStream(filename)));
				System.out.println("Game saved.");
			}
			catch (FileNotFoundException e) {
				System.out.println("Unable to save game to given file.");
			}
		}
		StdDraw.show();		
		keyboard.close();
	}

}
