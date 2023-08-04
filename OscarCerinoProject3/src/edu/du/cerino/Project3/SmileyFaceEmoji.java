package edu.du.cerino.Project3;

public class SmileyFaceEmoji extends FaceEmoji
{
	public SmileyFaceEmoji(double x, double y, double size) 
	{
		super(x, y, size);
	}
	
	public void draw()
	{
		super.draw();
		StdDraw.arc(x, y-(size/4), size/2, 180, 0);
	}
}
