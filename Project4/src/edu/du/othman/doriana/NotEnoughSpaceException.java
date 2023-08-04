package edu.du.othman.doriana;

public class NotEnoughSpaceException extends Exception
{
	public NotEnoughSpaceException()
	{
		super("NotEnoughSpaceException");
	}
	public NotEnoughSpaceException(long needed, long exists)
	{
		super("NotEnoughSpaceException "  + "Space needed: " + needed  + "Space Available: " + exists);
	}
}
