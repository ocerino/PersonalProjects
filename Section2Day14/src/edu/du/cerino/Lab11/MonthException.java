package edu.du.cerino.Lab11;

public class MonthException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MonthException()
	{
		super();
	}
	
	public MonthException(String message)
	{
		super(message);
	}
	
	public MonthException(int i)
	{
		super("That is an invalid month: " + i);
	}
}
