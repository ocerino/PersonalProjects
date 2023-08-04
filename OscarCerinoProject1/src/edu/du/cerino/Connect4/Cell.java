package edu.du.cerino.Connect4;



public class Cell 
{
	//Instance Variables
	public enum State {EMPTY,RED,BLUE};
	private State state=State.EMPTY;
	
	//Methods
	public Cell(State slotState)
	{
		state = slotState;
	}
	
	public State getState()
	{
		return this.state;
	}
	
	public void setState(State slotState)
	{
		state = slotState;
	}
}
