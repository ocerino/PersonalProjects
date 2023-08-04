package edu.du.cerino.Lab6;

public class HockeyPlayer extends Person {
	private int jerseyNum;
	public enum Position {CENTER, RIGHT_WING, LEFT_WING, DEFENDER, GOALIE, NO_POSITION_ASSIGNED};
	private Position pos;
	
	//Constructors
	public HockeyPlayer()
	{
		super();
		this.jerseyNum=0;
		this.pos= Position.NO_POSITION_ASSIGNED;
	}
	
	public HockeyPlayer(String n, int jersNum, Position position)
	{
		super(n);
		this.jerseyNum=jersNum;
		this.pos= position;
	}
	
	public HockeyPlayer(HockeyPlayer hp)
	{
		super(hp);
		this.jerseyNum = hp.jerseyNum;
		this.pos = hp.pos;
	}
	
	public void setHockeyPlayer(String n, int jersNum, Position position)
	{
		super.setName(n);
		this.jerseyNum=jersNum;
		this.pos=position;
	}
	
	public String toString()
	{
		return super.toString() +"\tJersey Number: " + this.jerseyNum +"\tPosition: " + this.pos;
	}
	
	public boolean equals(HockeyPlayer anotherHockeyPlayer)
	{	
		if(anotherHockeyPlayer == null)
		{
			return false;
		}
		return super.equals(anotherHockeyPlayer) && this.jerseyNum == anotherHockeyPlayer.jerseyNum && this.pos==anotherHockeyPlayer.pos;
	}
}
