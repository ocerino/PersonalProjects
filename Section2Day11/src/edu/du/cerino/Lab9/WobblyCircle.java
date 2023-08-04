package edu.du.cerino.Lab9;

public class WobblyCircle extends MovingCircle{

	public WobblyCircle(double r) {
		super(r);
		super.setColor(StdDraw.RED);
	}
	
	public void move()
	{
		super.forward();
		super.bounce();
		this.xPos = xPos+(Math.random()*0.02-0.01);
		this.yPos = yPos+(Math.random()*0.02-0.01);
	}

}
