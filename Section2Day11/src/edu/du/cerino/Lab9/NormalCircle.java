package edu.du.cerino.Lab9;

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
