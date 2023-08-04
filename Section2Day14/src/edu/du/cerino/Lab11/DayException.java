package edu.du.cerino.Lab11;

public class DayException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	public DayException() {
		super();
	}

	public DayException(String message) {
		super(message);
	}

	public DayException(int i)
	{
	super("That is an invalid day for the month: " + i);
	}
}
