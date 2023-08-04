package edu.du.cerino.Project3;

public class ClockEmoji extends Emoji
{
	private int hour;
	
	public ClockEmoji(double x, double y, double size, int hour)
	{
		super(x, y, size);
		this.hour=hour;
	}

	public void draw() 
	{
		StdDraw.circle(x, y, size);		
		StdDraw.line(x, y, x + size * Math.sin(hour % 12 * Math.PI / 6), y + size * Math.cos(hour % 12 * Math.PI / 6));
	}
}
