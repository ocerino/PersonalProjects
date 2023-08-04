package edu.du.cerino.Lab13;

public class ShuffleCipher implements MessageEncoder{
	private int numShuffles;
	
	public ShuffleCipher(int n)
	{
		this.numShuffles = n;
	}
	
	public String encode(String plaintext) {
		String shuffledMessage = shuffle(plaintext);
		for(int n = 0; n< numShuffles; n++)
		{
			shuffledMessage = shuffle(shuffledMessage);
		}
		
		return shuffledMessage;
	}
	
	public String shuffle(String message)
	{
		char [] shuffled = new char[message.length()];
		int cutpoint;
		if(message.length()%2 ==0)
		{
			cutpoint = message.length()/2;
		}
		else
		{
			cutpoint = (message.length()+1)/2;
		}
		
		String temp1 = message.substring(0, cutpoint);
		String temp2 = message.substring(cutpoint);
		
		for(int i = 0;i <temp1.length();i++)
		{
			shuffled[2*i] = temp1.charAt(i);
			if(i< cutpoint-1)
			{
				shuffled[2*i + 1] = temp2.charAt(i);
			}
		}
		String shuffledMessage = new String(shuffled);
		return shuffledMessage;
	}
	
}
