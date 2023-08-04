package edu.du.cerino.Project3;

public class SurprisedFaceEmoji extends FaceEmoji
{
	public SurprisedFaceEmoji(double x, double y, double size) 
	{
		super(x, y, size);
	}
	
	public void draw()
	{
		super.draw();
		StdDraw.filledCircle(x, y-(size/3), size/3);
	}
}
