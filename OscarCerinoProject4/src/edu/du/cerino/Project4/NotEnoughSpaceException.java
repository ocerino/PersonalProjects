package edu.du.cerino.Project4;

public class NotEnoughSpaceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	public NotEnoughSpaceException(long i, long j)
	{
		super("There isn't enough space in the file! The available space is:  " + i + " The space needed was: " + j);
	}
}
