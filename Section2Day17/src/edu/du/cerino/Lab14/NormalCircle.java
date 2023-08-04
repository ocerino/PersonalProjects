package edu.du.cerino.Lab14;

public class NormalCircle extends MovingCircle{

	public NormalCircle(double r) 
	{
		super(r);
		super.setColor(StdDraw.BLUE);
	}
	
	public void move()
	{
		super.forward();
		super.bounce();
	}

}
