package edu.du.cerino.Connect4;

import java.util.Scanner;
import edu.du.cerino.Connect4.Cell.State;

public class Connect4Game {
	private GameBoard gameBoard;
	private State p1;
	private State p2;
	private int playerTurn = 0;
	private int columnNum;
	Scanner kb = new Scanner(System.in);
	
	
	
	public Connect4Game()
	{
		gameBoard = new GameBoard();
		p1=State.RED;
		p2=State.BLUE;
	}
	
	public void playGame()
	{
		openingMessage();
		
		do
		{
			gameBoard.drawGameBoard();
			playerMessage();
			while(validInput())
			{
				playerMessage();
			}
		
			
			moveSelection();
			switchTurns();	
			
		}while(gameBoard.GameOver(GameBoard.lastCheckerRowNum, GameBoard.lastCheckerColumnNum));
		
		
	}
	
	private void openingMessage()
	{
		System.out.println("Welcome to Connect 4! To begin, choose among yourselves who will be player 1 and player 2.");
		System.out.println("Once that's decided, Player 1 may enter the number of the column he/she wants to drop a checker in.");
		System.out.println("The game continues until one player CONNECTS 4!!!!!!");
	}
	
	private void playerMessage()
	{
		System.out.println("Player "+ (playerTurn+1)+ ", choose your column.");
		columnNum = kb.nextInt();
	}
	
	private boolean validInput()
	{
		if(kb.hasNextInt())
		{
			if(columnNum<0 || columnNum>7)
			{
				System.out.println("That is not a valid number. Please choose again.");
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			System.out.println("That is not a valid input. Please choose again.");
			kb.nextLine();
			return false;
		}
	}
	
	private void moveSelection()
	{
		State playerState;
		if(playerTurn == 0)
		{
			playerState = p1;
		}
		else 
		{
			playerState = p2;
		}
		gameBoard.addChecker(columnNum-1, playerState);
	}
	
	private int switchTurns()
	{
		if(playerTurn == 0)
		{
			playerTurn++;
			return playerTurn;
		}
		else
		{
			playerTurn=0;
			return playerTurn;
		}
	}
	
	
}
