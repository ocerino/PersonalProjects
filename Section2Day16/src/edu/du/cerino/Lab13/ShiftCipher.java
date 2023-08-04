package edu.du.cerino.Lab13;

public class ShiftCipher implements MessageEncoder{
	private int shift;
	
	public ShiftCipher(int shift)
	{
		this.shift=shift;
	}

	public String encode(String plaintext) {
		char [] shifted = new char[plaintext.length()];
		
		for(int i=0;i<plaintext.length();i++)
		{
			shifted[i] = (char) ((plaintext.charAt(i) + shift) % 128);
			
		}
		String shiftedMessage = new String(shifted);
		return shiftedMessage;
	}
	
	
}
