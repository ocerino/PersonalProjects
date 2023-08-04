package edu.du.othman.doriana;

public class SecretMessageException extends Exception 
{
	public SecretMessageException()
	{
		super("SecretMessageException");
	}
	public SecretMessageException(String error)
	{
		super("SecretMessageException: " + error);
	}
}
