package edu.du.cerino.blackout;


public class BlackoutGameboard {
	private BlackoutWindow[][] board;
	
	// Constructor, two integer arguments give the number of rows and column in the board
	// each lights are initialized to on or off randomly (equal chances of 
	public BlackoutGameboard(int r, int c)
	{
		// Create a new game board
		board = new BlackoutWindow[r][c];
		// fill board with windows. lights are initialized on/off randomly with equal likelihood
		for (int i=0; i < r; i++) {
			for (int j=0; j < c; j++) {
				board[i][j] = new BlackoutWindow(Math.random() > 0.5, i, j);
			}
		}
		// Initialize StdDraw
		StdDraw.setCanvasSize(500,500);
		// Note: the number of columns determines the width in the x-direction
		// while the number of rows determines the with in the y-direction
		StdDraw.setXscale(0,c);
		StdDraw.setYscale(0,r);
	}
	
	public void draw()
	{
		// Draw all windows in the 2D array. Note that this.board.length is the number of rows
		// while this.board[0].length is the number of columns
		for (int i=0; i < this.board.length; i++) {
			for (int j=0; j < this.board[i].length; j++) {
				// ask each window to draw itself
				//Bug found below the array was written using parentheses rather than brackets and it was around both i and j rather than each one having separate brackets. I just replaced the parentheses with brackets
				board[i][j].draw();		
			}
		}
		// Draw the lines between the windows:
		//Bug found below pen color was set to grey but that is not the way the color is recognized by java. I just changed it from grey to gray
		StdDraw.setPenColor(StdDraw.GRAY);
		StdDraw.setPenRadius(0.005);
		// Draw the vertical lines, including ones at the left and right edge
		for (int i = 0; i < this.board[0].length+1; i++) {
			/*
			 * Bug found below. the for loop would only go to this.board[0].length when it should have gone to one above that so it can draw the vertical lines correctly. I just added a +1 at the end
			 */
			StdDraw.line(i,0, i, this.board[0].length+1);
		}
		// Draw the horizontal lines, including ones at the top and bottom
		for (int i = 0; i < this.board.length+1; i++) {
			/*
			 * Bug found below. similar to the one above except its for the horizontal lines. I just added a +1 to the end.
			 */
			StdDraw.line(0, i, this.board.length+1,i);
		}
		

	}
	
	/* This method should be called when a mouse is clicked on a window. It changes the states of the light at that position and
	 * all neighboring lights (above, below, left and right).
	 * xPos and yPos give the position on the screen of the mouse click. Because of how we have set up the scale, we can turn the
	 * mouse position into row and column indices just by casting (rounding down) to an integer. Once we know the position, we toggle
	 * the state of the light (turn it off if it is on and turn it on if it is off), and also toggle the states of each neighbor
	 * above, below, left and right
	 */ 
	public void clickLight(double xPos, double yPos)
	{
		int r, c;
		c = (int) xPos;
		r = (int) yPos;
		// toggle this light:
		board[r][c].toggle();
		// toggle the light below:
		/*
		 * bug found below. if player clicks on bottom row the game crashes. I just made it into an if statement so it would check if it would be possible to make that move
		 */
		if(r-1>=0)
		{
		board[r-1][c].toggle();
		}
		// toggle the light above:
		/*
		 * bug found below. similar to the one above except it happens when clicking on top row. I just made it into an if statement so it would check if it could make that move
		 */
		if(r+1<=board.length-1)
		board[r+1][c].toggle();
		// toggle the light to the left:
		/*
		 * bug found below. if player clicks on far left column game crashes. I just made it into an if statement so it would check if that move is possible
		 */
		if(c-1>=0)
		{
		board[r][c-1].toggle();
		}
		// toggle the light to the right:
		/*
		 * bug found below. similar to bug above except on far right column. I just made it into an if statement so it would check to see if that move is possible
		 */
		if(c+1<=board[r].length-1)
		{
			board[r][c+1].toggle();
		}
	}
	
	// Oops, I didn't write this method yet. You'll have to implement this method!
	public boolean allOn()
	{
		int checker = 0;
		for (int i=0; i < this.board.length-1; i++) 
		{
			for (int j=0; j < this.board[0].length-1; j++)
			{
				if(board[i][j].isLightOn())
				{
					checker++;
				}
			}
		}
		if(checker ==board.length*board[0].length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Oops, I didn't write this method yet. You'll have to implement this method!
	public boolean allOff()
	{ 
		int checker = 0;
		for (int i=0; i < this.board.length-1; i++) 
		{
			for (int j=0; j < this.board[0].length-1; j++)
			{
				if(!board[i][j].isLightOn())
				{
					checker++;
				}
			}
		}
		if(checker ==board.length*board[0].length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// This method is not used in the final code. It's just provided to help with debugging.
	// Notice that since row 1 is at the bottom, I need to draw the last row first.
	// This method has been debugged.
	public void drawToConsole()
	{
		for (int i = 0; i < this.board[0].length; i++)
			System.out.print("--");
		System.out.println("---");
		for (int i=this.board.length-1; i >= 0; i--) {
			System.out.print("| ");
			for (int j=0; j < this.board[0].length; j++) {
				if (board[i][j].isLightOn())
					System.out.print("O ");
				else
					System.out.print("X ");
			}
			System.out.println("|");
		}
		for (int i = 0; i < this.board[0].length; i++)
			System.out.print("--");
		System.out.println("---");
	}
}
