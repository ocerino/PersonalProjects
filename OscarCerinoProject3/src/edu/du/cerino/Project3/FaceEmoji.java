package edu.du.cerino.Project3;

public abstract class FaceEmoji extends Emoji
{
	public FaceEmoji(double x, double y, double size) 
	{
		super(x, y, size);
	}
	
	public void draw()
	{
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(x, y, size);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x-(size/3), y+(size/3), size/6);
		StdDraw.filledCircle(x+(size/3), y+(size/3), size/6);
	}
}
