package edu.du.cerino.Connect4;

import edu.du.cerino.Connect4.Cell.State;

public class GameBoard {
	//Instance Variables
	private Cell [][] board;
	private State playerState = State.EMPTY;
	public static int lastCheckerRowNum;
	public static int lastCheckerColumnNum;
	//Methods
	public GameBoard()
	{
		board = new Cell[6][7];
		
		for(int i = 0;i<7;i++)
		{
			for(int j = 0;j<6;j++)
			{
				board[j][i]=new Cell(playerState);
			}
		}
		
		StdDraw.setCanvasSize(700,600);
		StdDraw.setXscale(0,7);
		StdDraw.setYscale(0,6);
	}
	
	public GameBoard(int numPixelsTall)
	{
		board = new Cell[numPixelsTall-1][numPixelsTall];
		for(int i = 0;i<numPixelsTall;i++)
		{
			for(int j = 0;j<numPixelsTall-1;j++)
			{
				board [j][i].setState(State.EMPTY);
			}
		}
		StdDraw.setCanvasSize((numPixelsTall-1)*100,numPixelsTall*100);
		StdDraw.setXscale(0,numPixelsTall-1);
		StdDraw.setYscale(0,numPixelsTall);
	}
	
	public boolean columnFull(int columnNum)
	{
		boolean trueOrFalse = false;
		for(int i =0;i<6;i++)
		{
			if(board [i][columnNum-1].getState()!= State.EMPTY)
			{
				trueOrFalse = true;
			}
			else
			{
				trueOrFalse = false;
			}
		}
		return trueOrFalse;
	}
	
	public boolean addChecker(int columnNum, State  playerState)
	{
		if(columnFull(columnNum) == false)
		{
			int i=0;
			int cellIndex=0;
			do
			{
				cellIndex++;
				i++;
			}while(board [i][columnNum].getState()!= State.EMPTY);
			lastCheckerRowNum=i;
			lastCheckerColumnNum=cellIndex-1;
			board [cellIndex-1] [columnNum].setState(playerState);
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public void drawGameBoard()
	{
		StdDraw.clear();
		for(int i =0; i < 8;i++)
		{
			StdDraw.line(i, 0, i, 6);
		}
		for(int i =0;i<7;i++)
		{
			StdDraw.line(0, i, 7, i);
		}
		for(int i = 0;i<7;i++)
		{
			for(int j = 0;j<6;j++)
			{
				if(board [j][i].getState() == State.RED)
				{
					StdDraw.setPenColor(255,0,0);
					StdDraw.filledCircle(i+.5, j+.5, 0.5);
				}
				else if(board [j][i].getState() == State.BLUE)
				{
					StdDraw.setPenColor(0,0,255);
					StdDraw.filledCircle(i+.5, j+.5, 0.5);
				}
				else if(board[j][i].getState()== State.EMPTY)
				{
					StdDraw.circle(i+.5, j+.5, 0.5);
				}
				
			}
		}
		StdDraw.show();
		StdDraw.pause(5);
	}
	
	public boolean GameOver(int rowNum, int columnNum)
	{
		//vertical win
		if(board[rowNum][columnNum].getState()==board[rowNum+1][columnNum].getState() && board[rowNum][columnNum].getState()==board[rowNum+2][columnNum].getState() && board[rowNum][columnNum].getState()==board[rowNum+3][columnNum].getState())
		{
			return true;
		}
		else if(board[rowNum][columnNum].getState()==board[rowNum-1][columnNum].getState() && board[rowNum][columnNum].getState()==board[rowNum-2][columnNum].getState() && board[rowNum][columnNum].getState()==board[rowNum-3][columnNum].getState())
		{
			return true;
		}
		//horizontal wins
		else if(board[rowNum][columnNum].getState()==board[rowNum][columnNum+1].getState() && board[rowNum][columnNum].getState()==board[rowNum][columnNum+2].getState() && board[rowNum][columnNum].getState()==board[rowNum][columnNum+3].getState())
		{
			return true;
		}
		else if(board[rowNum][columnNum].getState()==board[rowNum][columnNum-1].getState() && board[rowNum][columnNum].getState()==board[rowNum][columnNum-2].getState() && board[rowNum][columnNum].getState()==board[rowNum][columnNum-3].getState())
		{
			return true;
		}
		else if(board[rowNum][columnNum].getState()==board[rowNum][columnNum-1].getState() && board[rowNum][columnNum].getState()==board[rowNum][columnNum-2].getState() && board[rowNum][columnNum].getState()==board[rowNum][columnNum+1].getState())
		{
			return true;
		}
		else if(board[rowNum][columnNum].getState()==board[rowNum][columnNum-1].getState() && board[rowNum][columnNum].getState()==board[rowNum][columnNum+1].getState() && board[rowNum][columnNum].getState()==board[rowNum][columnNum+2].getState())
		{
			return true;
		}
		//diagonal wins
		else if(board[rowNum][columnNum].getState()==board[rowNum+1][columnNum+1].getState() && board[rowNum][columnNum].getState()==board[rowNum+2][columnNum+2].getState() && board[rowNum][columnNum].getState()==board[rowNum+3][columnNum+3].getState())
		{
			return true;
		}
		else if(board[rowNum][columnNum].getState()==board[rowNum-1][columnNum-1].getState() && board[rowNum][columnNum].getState()==board[rowNum-2][columnNum-2].getState() && board[rowNum][columnNum].getState()==board[rowNum-3][columnNum-3].getState())
		{
			return true;
		}
		else if(board[rowNum][columnNum].getState()==board[rowNum-1][columnNum-1].getState() && board[rowNum][columnNum].getState()==board[rowNum-2][columnNum-2].getState() && board[rowNum][columnNum].getState()==board[rowNum+1][columnNum+1].getState())
		{
			return true;
		}
		else if(board[rowNum][columnNum].getState()==board[rowNum-1][columnNum-1].getState() && board[rowNum][columnNum].getState()==board[rowNum+1][columnNum+1].getState() && board[rowNum][columnNum].getState()==board[rowNum+2][columnNum+2].getState())
		{
			return true;
		}
		return false;
	}
}
